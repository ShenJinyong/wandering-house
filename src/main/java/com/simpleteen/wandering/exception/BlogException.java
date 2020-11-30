package com.simpleteen.wandering.exception;

import com.simpleteen.wandering.common.Results;
import com.simpleteen.wandering.service.IErrorInfo;

public class BlogException extends RuntimeException{

    private final IErrorInfo errorInfo;

    public BlogException(IErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * 将异常转换为 ResultVO 对象返回给前端
     *
     * @return 封装了异常信息的 ResultVO 对象
     */
    public Results toResultVO() {
        return Results.fromErrorInfo(errorInfo);
    }
}
