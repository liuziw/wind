package com.lzw.wind.gateway.vo;

import lombok.Data;

@Data
public class ResponseVO<T> {
    private Integer code;

    private String msg;

    private T data;

    public ResponseVO() {
    }

    public ResponseVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
