package com.talearnt.exception.user;

import com.talearnt.enums.ErrorCode;

public class InvalidUserInputException extends Exception{
    private final ErrorCode errorCode;

    public InvalidUserInputException(String msg){
        super(msg);
        this.errorCode = ErrorCode.INVALID_USER_INPUT;
    }

    public InvalidUserInputException(String msg, Throwable cause){
        super(msg,cause);
        this.errorCode = ErrorCode.INVALID_USER_INPUT;
    }

    public ErrorCode getErrorCode(){
        return errorCode;
    }
}
