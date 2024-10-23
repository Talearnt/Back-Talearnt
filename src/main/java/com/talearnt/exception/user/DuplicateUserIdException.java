package com.talearnt.exception.user;

import com.talearnt.enums.ErrorCode;

public class DuplicateUserIdException extends Exception{
    private final ErrorCode errorCode;

    public DuplicateUserIdException(String msg){
        super(msg);
        this.errorCode = ErrorCode.DUPLICATE_USER_ID;
    }

    public DuplicateUserIdException(String msg, Throwable cause){
        super(msg,cause);
        this.errorCode = ErrorCode.DUPLICATE_USER_ID;
    }

    public ErrorCode getErrorCode(){
        return errorCode;
    }
}
