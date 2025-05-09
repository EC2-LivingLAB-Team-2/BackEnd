package com.livinglab8.global.common;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class Response<T> {
    private int status;
    private String message;
    private T data;

    public Response(HttpStatus status, String message, T data) {
        this.status = status.value();
        this.message = message;
        this.data = data;
    }
}