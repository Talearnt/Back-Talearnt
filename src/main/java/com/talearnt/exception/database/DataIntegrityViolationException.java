package com.talearnt.exception.database;

import com.talearnt.enums.ErrorCode;

public class DataIntegrityViolationException extends RuntimeException{
    private final ErrorCode errorCode;

    public DataIntegrityViolationException(String msg){
        super(msg);
        this.errorCode = ErrorCode.DB_TIMEOUT_ERROR;
    }

    public DataIntegrityViolationException(String msg,Throwable cause){
        super(msg,cause);
        this.errorCode = ErrorCode.DB_TIMEOUT_ERROR;
    }

    public ErrorCode getErrorCode(){
        return errorCode;
    }

}
