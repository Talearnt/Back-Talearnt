package com.talearnt.exception.user;

import com.talearnt.enums.ErrorCode;

public class UserNotFoundException extends Exception{
    private final ErrorCode errorCode;

    public UserNotFoundException(String msg){
        super(msg);
        this.errorCode = ErrorCode.USER_NOT_FOUND;
    }

    public UserNotFoundException(String msg,Throwable cause){
        super(msg,cause);
        this.errorCode = ErrorCode.USER_NOT_FOUND;
    }

    public ErrorCode getErrorCode(){
        return errorCode;
    }
}
