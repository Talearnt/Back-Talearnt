package com.talearnt;


import com.talearnt.enums.ErrorCode;
import com.talearnt.utill.CommonResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 연관된 Class = /Enums/ErrorCode,
 *              /Utill/ApiResponse
 *
 * Exception 전역 관리하는 Class 입니다.
 * 이 곳에 Exception이 터질 요인들을 모아두고 관리합니다.
 * */
@ControllerAdvice
public class GlobalExceptionHandler {

    /** 최상위 Exception,
     *  다른 ExceptionHandler에 속하지 않은 오류들은 이곳으로 도착합니다.
     *  Log를 통하여 세부적인 Exception 이름을 알 수 있습니다.
     * */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<CommonResponse<String>> handleException(Exception e) {
        // 세부 Exception 이름 디버깅용
        e.printStackTrace();
        return CommonResponse.error(ErrorCode.UNKNOWN_ERROR);
    }

}
