package com.talearnt.Enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ErrorCode {
    // 인증 관련 오류
    INVALID_TOKEN("401-AUTH-01", "올바르지 않은 인증 토큰입니다."),
    EXPIRED_TOKEN("401-AUTH-02", "인증 토큰이 만료되었습니다."),
    INVALID_CREDENTIALS("401-AUTH-03", "잘못된 사용자 이름 또는 비밀번호입니다."),

    // 사용자 관련 오류
    USER_NOT_FOUND("404-USER-01", "해당 회원을 찾을 수 없습니다."),
    DUPLICATE_USER("400-USER-02", "해당 닉네임은 이미 존재합니다."),

    // 데이터베이스 관련 오류
    DB_CONNECTION_ERROR("500-DB-01", "데이터 베이스에 연결 실패했습니다.."),
    DB_QUERY_ERROR("500-DB-02", "데이터 베이스에 잘못된 쿼리 입력되었습니다."),

    // 아직 확인되지 않은 오류
    UNKNOWN_ERROR("500-UNKNOWN-01", "알 수 없는 오류가 발생했습니다. 관리자에게 문의하세요.");

    private final String code;
    private final String message;
}
