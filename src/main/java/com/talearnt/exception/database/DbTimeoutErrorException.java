package com.talearnt.exception.database;

import com.talearnt.enums.ErrorCode;

public class DbTimeoutErrorException extends RuntimeException{
    private final ErrorCode errorCode;

    public DbTimeoutErrorException(String msg){
        super(msg);
        this.errorCode = ErrorCode.DB_TIMEOUT_ERROR;
    }

    public DbTimeoutErrorException(String msg,Throwable cause){
        super(msg,cause);
        this.errorCode = ErrorCode.DB_TIMEOUT_ERROR;
    }

    public ErrorCode getErrorCode(){
        return errorCode;
    }
}
