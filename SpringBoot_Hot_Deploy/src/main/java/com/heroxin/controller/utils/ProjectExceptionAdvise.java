package com.heroxin.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Heroxin
 * @create 2022-04-13-17:25
 * @Description:
 */

//作为 SpringMVC 的异常处理器
@RestControllerAdvice
public class ProjectExceptionAdvise {

//    拦截所有的异常信息
    @ExceptionHandler
    public R doException(Exception e){
        e.printStackTrace();
        return new R("服务器故障,请稍后再试!");
    }
}
