package com.aiways.pagehelper.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Resp<E> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer code;
    private String message;
    private E data;

    /**
     * 业务处理成功
     */
    public static <T> Resp<T> success(String message) {
        return success(message, null);
    }

    public static <T> Resp<T> success() {
        return success(null, null);
    }

    public static <T> Resp<T> success(T data) {
        return success(null, data);
    }

    public static <T> Resp<T> success(String message, T data) {
        return new Resp(RespStatus.Success.code, message, data);
    }

    /**
     * 业务处理失败
     */
    public static <T> Resp<T> failure(String message) {
        return failure(message, null);
    }

    public static <T> Resp<T> failure(String message, T data) {
        return new Resp(RespStatus.Failure.code, message, data);
    }
    public static <T> Resp pageResult(T data) {
        return new Resp(RespStatus.Success.code, null, new PageResult(data));
    }
}
