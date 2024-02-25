package com.my.Aspect;

import com.my.Annotation.Log;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;


@Component
@org.aspectj.lang.annotation.Aspect
@Slf4j
public class LogAspect {
    @Pointcut("@annotation(com.my.Annotation.Log)")
    public void pointcut(){

    }
    @Before("pointcut()")
    public void logMethodExecution(JoinPoint joinPoint) throws Throwable {
        // 获取方法名
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getName();

        // 获取请求参数
        Object[] args = joinPoint.getArgs();

        // 获取注解的值
        Log annotation = getAnnotation(joinPoint);

        // 获取请求IP
        String requestIp = getRequestIp(joinPoint);

        // 打印信息
        log.info("Class: {}, Method: {}, Request Parameters: {}, 操作详情: {}, Request IP: {}",
                className, methodName, Arrays.toString(args), annotation.op(), requestIp);


    }
    private Log getAnnotation(JoinPoint joinPoint) {
       Log annotation = null;
        try {
            // 获取目标方法
            Class<?> targetClass = joinPoint.getTarget().getClass();
            String methodName = joinPoint.getSignature().getName();
            Class<?>[] parameterTypes = ((org.aspectj.lang.reflect.MethodSignature) joinPoint.getSignature()).getMethod().getParameterTypes();
            java.lang.reflect.Method targetMethod = targetClass.getMethod(methodName, parameterTypes);

            // 获取注解
            annotation = targetMethod.getAnnotation(Log.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return annotation;
    }

    private String getRequestIp(JoinPoint joinPoint) {
        // 获取HttpServletRequest对象
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg instanceof HttpServletRequest) {
                HttpServletRequest request = (HttpServletRequest) arg;
                return request.getRemoteAddr();
            }
        }
        return "Unknown";
    }
}


