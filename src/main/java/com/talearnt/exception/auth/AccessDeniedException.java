package com.talearnt.exception.auth;

import com.talearnt.enums.ErrorCode;

public class AccessDeniedException extends Exception{
    private final ErrorCode errorCode;

    public AccessDeniedException(String msg){
        super(msg);
        this.errorCode = ErrorCode.ACCESS_DENIED;
    }

    public AccessDeniedException(String msg,Throwable cause){
        super(msg,cause);
        this.errorCode = ErrorCode.ACCESS_DENIED;
    }

    public ErrorCode getErrorCode(){
        return errorCode;
    }
}
