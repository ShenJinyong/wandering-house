package com.simpleteen.wandering.controller;

import com.simpleteen.wandering.common.Results;
import com.simpleteen.wandering.enums.ErrorInfoEnum;
import com.simpleteen.wandering.exception.BlogException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "通用接口")
@RestController
public class CommonController {
    @ApiOperation("检查服务端是否正常")
    @GetMapping("/ping")
    public Results ping() {
        throw new BlogException(ErrorInfoEnum.MISSING_PARAMETERS);
    }
}