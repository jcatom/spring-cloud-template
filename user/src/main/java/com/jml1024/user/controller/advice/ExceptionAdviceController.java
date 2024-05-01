package com.jml1024.user.controller.advice;

import com.jml1024.common.response.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdviceController {

    @ExceptionHandler(value = Exception.class)
    public Result exception(Exception e) {
        e.printStackTrace();
        Result result = new Result();
        result.setCode(100000);
        result.setMessage(e.getMessage());
        result.setTimestamp(System.currentTimeMillis());
        return result;
    }
}
