package com.ddh.dmeo2;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService  = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);
        userServiceProxy.update();
    }
}
