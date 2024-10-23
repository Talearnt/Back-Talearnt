package com.talearnt.exception.user;

import com.talearnt.enums.ErrorCode;

public class DuplicateUserNicknameException extends Exception {
    private final ErrorCode errorCode;

    public DuplicateUserNicknameException(String msg){
        super(msg);
        this.errorCode = ErrorCode.DUPLICATE_USER_NICKNAME;
    }

    public DuplicateUserNicknameException(String msg, Throwable cause){
        super(msg,cause);
        this.errorCode = ErrorCode.DUPLICATE_USER_NICKNAME;
    }

    public ErrorCode getErrorCode(){
        return errorCode;
    }
}
