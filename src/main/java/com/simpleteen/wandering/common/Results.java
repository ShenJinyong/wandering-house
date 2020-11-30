package com.simpleteen.wandering.common;

import com.simpleteen.wandering.service.IErrorInfo;
import com.simpleteen.wandering.utils.BlogUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Builder
@ApiModel("通用接口返回对象")
public class Results<T> {
    @ApiModelProperty(required = true, notes = "结果码", example = "2000")
    private int code;
    @ApiModelProperty(required = true, notes = "返回信息", example = "操作成功")
    private String msg;
    @ApiModelProperty(required = true, notes = "返回数据", example = "{\"id\":2020}")
    private T data;
    @ApiModelProperty(required = true, notes = "时间戳", example = "2020-11-27 00:00:00")
    private String timestamp;



    public static Results fromErrorInfo(IErrorInfo errorInfo) {
        return Results.builder()
                .code(errorInfo.getCode())
                .msg(errorInfo.getMsg())
                .timestamp(BlogUtils.now())
                .build();
    }
}
