package com.simpleteen.wandering.handler;

import com.simpleteen.wandering.common.Results;
import com.simpleteen.wandering.enums.ErrorInfoEnum;
import com.simpleteen.wandering.exception.BlogException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Results noHandlerFoundExceptionHandler(NoHandlerFoundException exception) {
        log.error("NoHandlerFoundException:{}", exception.getMessage());
        return Results.fromErrorInfo(ErrorInfoEnum.RESOURCES_NOT_FOUND);
    }

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public Results exceptionHandler(Exception exception) {
        exception.printStackTrace();
        log.error("Exception:{}", exception.getMessage());
        return Results.fromErrorInfo(ErrorInfoEnum.UNKNOWN_ERROR);
    }

    @ResponseBody
    @ExceptionHandler(value = BlogException.class)
    @ResponseStatus(HttpStatus.OK)
    public Results blogExceptionHandler(BlogException exception) {
        log.error("BlogException:{}", exception.getMessage());
        return exception.toResultVO();
    }
}
