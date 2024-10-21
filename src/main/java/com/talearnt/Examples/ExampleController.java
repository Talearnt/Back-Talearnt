package com.talearnt.Examples;


import com.talearnt.Enums.ErrorCode;
import com.talearnt.util.CommonResponse;
import com.talearnt.swagger.annotions.UserNotFound;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Tag(name = "example", description = "Swagger 사용 예제입니다.")
@RestController
@RequestMapping("/exam")
@RequiredArgsConstructor
public class ExampleController {

    private final ModelMapper mapper;

    @GetMapping("/posts")
    @Operation(summary = "내용에 관한 요약은 여기에 적습니다",
            description = "내용에 대한 설명은 여기에 적습니다.",
            tags = {"example"},
            responses = {
                    @ApiResponse(responseCode = "200", description = "로맨틱 성공적"),
                    @ApiResponse(responseCode = "400", description = "로맨틱 실패적")
            })
    public ResponseEntity<CommonResponse<List<ExamResDTO>>> getExams(){

        List<ExamResDTO> examList = new ArrayList<>();

        examList.add(new ExamResDTO.ExamResDTOBuilder().examId("예제 게시글 1").nickname("예제 닉네임1").build());
        examList.add(new ExamResDTO.ExamResDTOBuilder().examId("예제 게시글 2").nickname("예제 닉네임2").build());

        return CommonResponse.success(examList);
    }



    @PostMapping("/exam")
    @Operation(summary = "예제 수정 요약",
            description = "예제를 수정하는 내용입니다",
            tags = {"예제 Tags"},
    responses = {
            @ApiResponse(responseCode = "200", description = "성공적으로 예제의 정보를 바꿨습니다.")
    })
    @UserNotFound
    public ResponseEntity<CommonResponse<ExamResDTO>> updateExam(@RequestBody ExamReqDTO dto){
        Exam exam = mapper.map(dto, Exam.class);
        exam.setNickname("예제 닉네임4");
        ExamResDTO resDto = mapper.map(exam,ExamResDTO.class);
        if (resDto.getNickname().equals(dto.getNickname())){
            return CommonResponse.success(resDto);
        }else{
            return CommonResponse.error(ErrorCode.USER_NOT_FOUND);
        }
    }

}
