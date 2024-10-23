package com.talearnt.exception.user;

import com.talearnt.enums.ErrorCode;

public class UserSuspendedException extends Exception{
    private final ErrorCode errorCode;

    public UserSuspendedException(String msg){
        super(msg);
        this.errorCode = ErrorCode.USER_SUSPENDED;
    }

    public UserSuspendedException(String msg, Throwable cause){
        super(msg,cause);
        this.errorCode = ErrorCode.USER_SUSPENDED;
    }

    public ErrorCode getErrorCode(){
        return errorCode;
    }
}
