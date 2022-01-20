package com.ddh.apollo.controller;

import com.ddh.apollo.entity.UserBean;
import com.ddh.apollo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register")
    public String register
            (
                    UserBean user
            ) {
        //调用注册业务逻辑
        userService.register(user);
        return "注册成功.";
    }
}
