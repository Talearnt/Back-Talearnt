package com.talearnt;

import com.talearnt.enums.ErrorCode;
import com.talearnt.exception.auth.AccessDeniedException;
import com.talearnt.exception.auth.ExpiredTokenException;
import com.talearnt.exception.auth.InvalidCredentialsException;
import com.talearnt.exception.auth.InvalidTokenException;
import com.talearnt.exception.database.DataIntegrityViolationException;
import com.talearnt.exception.database.DbConnectionErrorException;
import com.talearnt.exception.database.DbQueryErrorException;
import com.talearnt.exception.database.DbTimeoutErrorException;
import com.talearnt.exception.user.*;
import com.talearnt.util.CommonResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 연관된 Class = /Enums/ErrorCode,
 *              /Utill/ApiResponse
 *
 * Exception 전역 관리하는 Class 입니다.
 * 이 곳에 Exception이 터질 요인들을 모아두고 관리합니다.
 * */
@Log4j2
@RestControllerAdvice
public class GlobalExceptionHandler {

    // 인증 관련 오류
    @ExceptionHandler(InvalidCredentialsException.class)
    public ResponseEntity<CommonResponse<ErrorCode>> handleInvalidCredentialsException(InvalidCredentialsException e) {
        return CommonResponse.error(e.getErrorCode());
    }

    @ExceptionHandler(ExpiredTokenException.class)
    public ResponseEntity<CommonResponse<ErrorCode>> handleExpiredTokenException(ExpiredTokenException e) {
        return CommonResponse.error(e.getErrorCode());
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<CommonResponse<ErrorCode>> handleAccessDeniedException(AccessDeniedException e) {
        return CommonResponse.error(e.getErrorCode());
    }

    @ExceptionHandler(InvalidTokenException.class)
    public ResponseEntity<CommonResponse<ErrorCode>> handleInvalidTokenException(InvalidTokenException e) {
        return CommonResponse.error(e.getErrorCode());
    }


    // 사용자 관련 오류
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<CommonResponse<ErrorCode>> handleUserNotFoundException(UserNotFoundException e){
        return CommonResponse.error(e.getErrorCode());
    }

    @ExceptionHandler(DuplicateUserIdException.class)
    public ResponseEntity<CommonResponse<ErrorCode>> handleDuplicateUserIdException(DuplicateUserIdException e){
        return CommonResponse.error(e.getErrorCode());
    }

    @ExceptionHandler(DuplicateUserNicknameException.class)
    public ResponseEntity<CommonResponse<ErrorCode>> handleDuplicateUserNicknameException(DuplicateUserNicknameException e){
        return CommonResponse.error(e.getErrorCode());
    }

    @ExceptionHandler(InvalidUserInputException.class)
    public ResponseEntity<CommonResponse<ErrorCode>> handleInvalidUserInputException(InvalidUserInputException e){
        return CommonResponse.error(e.getErrorCode());
    }

    @ExceptionHandler(UserSuspendedException.class)
    public ResponseEntity<CommonResponse<ErrorCode>> handleUserSuspendedException(UserSuspendedException e){
        return CommonResponse.error(e.getErrorCode());
    }


    // 데이터베이스 관련 오류
    @ExceptionHandler(DbConnectionErrorException.class)
    public ResponseEntity<CommonResponse<ErrorCode>> handleDbConnectionErrorException(DbConnectionErrorException e) {
        return CommonResponse.error(e.getErrorCode());
    }

    @ExceptionHandler(DbQueryErrorException.class)
    public ResponseEntity<CommonResponse<ErrorCode>> handleDbQueryErrorException(DbQueryErrorException e) {
        return CommonResponse.error(e.getErrorCode());
    }

    @ExceptionHandler(DbTimeoutErrorException.class)
    public ResponseEntity<CommonResponse<ErrorCode>> handleDbTimeoutErrorException(DbTimeoutErrorException e) {
        return CommonResponse.error(e.getErrorCode());
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<CommonResponse<ErrorCode>> handleDataIntegrityViolationException(DataIntegrityViolationException e) {
        return CommonResponse.error(e.getErrorCode());
    }


    /** 최상위 Exception,
     *  다른 ExceptionHandler에 속하지 않은 오류들은 이곳으로 도착합니다.
     *  Log를 통하여 세부적인 Exception 이름을 알 수 있습니다.
     * */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<CommonResponse<ErrorCode>> handleException(Exception e) {
        // 세부 Exception 이름 디버깅용
        e.printStackTrace();
        return CommonResponse.error(ErrorCode.UNKNOWN_ERROR);
    }

}
