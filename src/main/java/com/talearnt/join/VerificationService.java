package com.talearnt.join;


import net.nurigo.sdk.NurigoApp;
import net.nurigo.sdk.message.model.Message;
import net.nurigo.sdk.message.request.SingleMessageSendingRequest;
import net.nurigo.sdk.message.response.SingleMessageSentResponse;
import net.nurigo.sdk.message.service.DefaultMessageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class VerificationService {

    @Value("${coolsms.fromNumber}")
    private String fromNumber;

    private DefaultMessageService messageService;
    private VerificationCodeRepository verificationCodeRepository;

    public VerificationService(
            @Value("${coolsms.apiKey}") String apiKey,
            @Value("${coolsms.secretKey}") String apiSecret) {

        this.messageService = NurigoApp.INSTANCE.initialize(apiKey, apiSecret, "https://api.coolsms.co.kr");
    }

    public SingleMessageSentResponse sendVerificationMessage(@RequestBody VerificationReqDTO verificationReqDTO) {
        Message message = new Message();

        message.setFrom(fromNumber);
        message.setTo(verificationReqDTO.getPhone());
        message.setText("Talearnt 인증번호는 [" + verificationReqDTO.getVerificationCode() + "] 입니다.");

        SingleMessageSentResponse response = this.messageService.sendOne(new SingleMessageSendingRequest(message));
        System.out.println(response);

        return response;
    }

    public boolean verifyCode(@RequestParam String userId, @RequestParam String inputCode) {
        // DB에서 userId에 해당하는 VerificationCodeEntity를 가져옴
        PhoneVerification phoneVerification = verificationCodeRepository.findByUserId(userId);

        // 검증: 클라이언트가 입력한 코드와 DB의 코드 비교
        if (phoneVerification != null && phoneVerification.getVerificationCode().equals(inputCode)) {
            // 인증 성공
            System.out.println("인증 성공");
            return true;
        } else {
            // 인증 실패
            System.out.println("인증 실패");
            return false;
        }
    }

}
