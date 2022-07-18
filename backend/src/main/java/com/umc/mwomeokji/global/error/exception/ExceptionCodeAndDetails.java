package com.umc.mwomeokji.global.error.exception;

import lombok.Getter;

@Getter
public enum ExceptionCodeAndDetails {

    // 0000: global
    NOT_FOUND_ERROR_CODE(500, "0001", "발생한 에러의 에러코드를 찾을 수 없습니다."),
    INVALID_INPUT_VALUE(400, "0002", "유효하지 않은 입력입니다."),
    METHOD_NOT_ALLOWED(405, "0003", "허용되지 않은 메소드 접근입니다. 올바른 HTTP Methods 를 입력해주세요."),

    // 1000: USER
    DUPLICATED_USER_EMAIL(400, "1001", "이미 존재하는 회원 이메일입니다.")

    ;
    private final int status;
    private final String code;
    private final String message;

    ExceptionCodeAndDetails(int status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
