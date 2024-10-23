package com.talearnt.exception.database;

import com.talearnt.enums.ErrorCode;

public class DbQueryErrorException extends RuntimeException{
    private final ErrorCode errorCode;

    public DbQueryErrorException(String msg){
        super(msg);
        this.errorCode = ErrorCode.DB_QUERY_ERROR;
    }

    public DbQueryErrorException(String msg,Throwable cause){
        super(msg,cause);
        this.errorCode = ErrorCode.DB_QUERY_ERROR;
    }

    public ErrorCode getErrorCode(){
        return errorCode;
    }

}
