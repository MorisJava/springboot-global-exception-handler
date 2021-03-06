package com.nobody.exception;

import lombok.Getter;

/**
 * @Description 自定义通用异常枚举类
 * @Author Mr.nobody
 * @Date 2020/10/23
 * @Version 1.0
 */
@Getter
public enum CommonErrorEnum implements BaseErrorInfo {

    /**
     * 成功
     */
    SUCCESS("200", "成功!"),
    /**
     * 请求的数据格式不符!
     */
    BODY_NOT_MATCH("400", "请求的数据格式不符!"),
    /**
     * 未找到该资源!
     */
    NOT_FOUND("404", "未找到该资源!"),
    /**
     * 服务器内部错误!
     */
    INTERNAL_SERVER_ERROR("500", "服务器内部错误!"),
    /**
     * 服务器正忙，请稍后再试!
     */
    SERVER_BUSY("503", "服务器正忙，请稍后再试!");

    private String errorCode;
    private String errorMsg;

    CommonErrorEnum(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
