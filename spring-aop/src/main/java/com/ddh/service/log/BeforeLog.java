package com.ddh.service.log;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
@Component
public class BeforeLog implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "执行了　" + method.getName() + "　方法");

    }
}
