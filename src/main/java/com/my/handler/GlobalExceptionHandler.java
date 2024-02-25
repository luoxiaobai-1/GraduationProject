package com.my.handler;

import com.my.Exception.BaseException;
import com.my.Result.ResponseInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 捕获业务异常
     * @param ex
     * @return
     */
    @ExceptionHandler
    public ResponseInfo exceptionHandler(BaseException ex){
        log.error("异常信息：{}", ex.getMessage());
        return ResponseInfo.Fail(ex.getMessage());
    }
    @ExceptionHandler({BindException.class})
    public  ResponseInfo MethodArgumentNotValidExceptionHandler(BindException e) {
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        log.error("异常信息：{}", objectError);
        return ResponseInfo.Fail(objectError.getDefaultMessage());
    }
    }

