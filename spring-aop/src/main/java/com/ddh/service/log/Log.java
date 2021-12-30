package com.ddh.service.log;

import org.springframework.stereotype.Component;

@Component
public class Log {

    public void before(){
        System.out.println("前置通知");
    }

    public void after(){
        System.out.println("后置通知");
    }
}
