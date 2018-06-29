package com.hongghe.kafkamqdemo.domain;

import lombok.Data;

@Data
public class ApiResult {
    private Integer errorCode;
    private String errorMessage;
    private Object data;
}
