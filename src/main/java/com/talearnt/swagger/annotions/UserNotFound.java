package com.talearnt.swagger.annotions;


import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ApiResponse(responseCode = "404", description = "해당 회원을 찾을 수 없음",content =@Content(mediaType = "application/json",
        schema = @Schema(example = """
                        {
                          "data": null,
                          "errorCode": "404-USER-01",
                          "errorMessage": "해당 회원을 찾을 수 없습니다.",
                          "success": false
                        }
                    """)))
public @interface UserNotFound {}
