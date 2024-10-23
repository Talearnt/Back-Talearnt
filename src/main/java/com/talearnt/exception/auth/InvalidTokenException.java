package com.talearnt.exception.auth;

import com.talearnt.enums.ErrorCode;

public class InvalidTokenException extends Exception{
    private final ErrorCode errorCode;

    public InvalidTokenException(String msg){
        super(msg);
        this.errorCode = ErrorCode.INVALID_TOKEN;
    }

    public InvalidTokenException(String msg, Throwable cause){
        super(msg,cause);
        this.errorCode = ErrorCode.INVALID_TOKEN;
    }

    public ErrorCode getErrorCode(){
        return errorCode;
    }

}
