package com.talearnt.exception.auth;

import com.talearnt.enums.ErrorCode;

public class InvalidCredentialsException extends Exception{
    private final ErrorCode errorCode;

    public InvalidCredentialsException(String msg){
        super(msg);
        this.errorCode = ErrorCode.INVALID_CREDENTIALS;
    }

    public InvalidCredentialsException(String msg,Throwable cause){
        super(msg,cause);
        this.errorCode = ErrorCode.INVALID_CREDENTIALS;
    }

    public ErrorCode getErrorCode(){
        return errorCode;
    }
}
