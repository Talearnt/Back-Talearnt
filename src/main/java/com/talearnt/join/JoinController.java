package com.talearnt.join;

import com.talearnt.enums.Gender;
import com.talearnt.enums.UserRole;
import com.talearnt.enums.UserRole;
import com.talearnt.examples.Exam;
import com.talearnt.examples.ExamReqDTO;
import com.talearnt.examples.ExamResDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class JoinController {

    //private final JoinRepository joinRepository;


    @PostMapping("/api/join")
    String addUser(@RequestBody JoinReqDTO joinReqDTO){



        //var hash = new BCryptPasswordEncoder().encode(pw);

    //    joinRepository.save(user);

        return "redirect:/";
    }

//    @PostMapping("/api/join")
//    public ResponseEntity<com.talearnt.Util.CommonResponse<ExamResDTO>> updateExam(@RequestBody JoinReqDTO dto){
//        User user = mapper.map(dto, User.class);
//        exam.setNickname("예제 닉네임4");
//        ExamResDTO resDto = mapper.map(exam,ExamResDTO.class);
//        if (resDto.getNickname().equals(dto.getNickname())){
//            return com.talearnt.Util.CommonResponse.success(resDto);
//        }else{
//            return com.talearnt.Util.CommonResponse.error(ErrorCode.USER_NOT_FOUND);
//        }
//    }
}
