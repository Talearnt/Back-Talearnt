package com.talearnt.util;

import com.talearnt.Enums.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse<T> {

    private boolean isSuccess;
    private T data;
    private String errorCode;
    private String errorMessage;


    public static <T> ResponseEntity<CommonResponse<T>> success(T data){
       return ResponseEntity.ok(new CommonResponse<T>(true, data,null,null));
    }

    public static <T> ResponseEntity<CommonResponse<T>> error(ErrorCode errorCode) {
        HttpStatus status = HttpStatus.valueOf(Integer.parseInt(errorCode.getCode().substring(0, 3)));
        return ResponseEntity.status(status).body(new CommonResponse<>(false, null, errorCode.getCode(),errorCode.getMessage()));
    }

}
