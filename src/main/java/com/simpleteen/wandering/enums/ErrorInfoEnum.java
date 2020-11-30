package com.simpleteen.wandering.enums;

import com.simpleteen.wandering.service.IErrorInfo;

public enum ErrorInfoEnum implements IErrorInfo{
    SUCCESS(2000, "操作成功"),
    MISSING_PARAMETERS(4004, "参数缺失"),
    UNKNOWN_ERROR(5000, "出现未知错误"),
    RESOURCES_NOT_FOUND(4003, "找不到相应资源");

    private int code;
    private String msg;

    ErrorInfoEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
