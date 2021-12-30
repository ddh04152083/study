package com.ddh.service.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnotationPointCut {

    @Pointcut("execution(* com.ddh.service.*.*(..))")
    public void pointCut(){

    }
    @Before("pointCut()")
    public void before(){
        System.out.println("方法执行前");
    }
    @After("pointCut()")
    public void after(){
        System.out.println("方法执行后");
    }
    @Around("pointCut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around 前");
        joinPoint.proceed();
        System.out.println("around 后");
    }
}

