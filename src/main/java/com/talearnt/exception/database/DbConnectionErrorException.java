package com.talearnt.exception.database;

import com.talearnt.enums.ErrorCode;

public class DbConnectionErrorException extends RuntimeException {
    private final ErrorCode errorCode;

    public DbConnectionErrorException(String msg){
        super(msg);
        this.errorCode = ErrorCode.DB_CONNECTION_ERROR;
    }

    public DbConnectionErrorException(String msg,Throwable cause){
        super(msg,cause);
        this.errorCode = ErrorCode.DB_CONNECTION_ERROR;
    }

    public ErrorCode getErrorCode(){
        return errorCode;
    }
}
