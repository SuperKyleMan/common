package com.aiways.generator.model;

public enum RespStatus {
    Success(0, "业务处理成功"),
    Failure(1, "业务处理失败");

    public final int code;
    public final String name;

    RespStatus(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
