package com.talearnt.exception.auth;

import com.talearnt.enums.ErrorCode;

public class ExpiredTokenException extends Exception{
    private final ErrorCode errorCode;

    public ExpiredTokenException(String msg){
        super(msg);
        this.errorCode = ErrorCode.EXPIRED_TOKEN;
    }

    public ExpiredTokenException(String msg,Throwable cause){
        super(msg,cause);
        this.errorCode = ErrorCode.EXPIRED_TOKEN;
    }

    public ErrorCode getErrorCode(){
        return errorCode;
    }
}
