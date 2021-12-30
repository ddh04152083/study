package com.ddh.demo3;

import com.ddh.dmeo2.UserService;
import com.ddh.dmeo2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        UserService userService =new UserServiceImpl();
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler();
        invocationHandler.setTarget(userService);
        UserService proxy = (UserService)invocationHandler.getProxy();
        proxy.update();
    }
}
