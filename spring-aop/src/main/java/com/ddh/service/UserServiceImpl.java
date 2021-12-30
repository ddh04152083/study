package com.ddh.service;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    public void add() {
        System.out.println("增加");
    }


    public void delete() {
        System.out.println("删除");
    }

    public void update() {
        System.out.println("更新");
    }

    public void query() {
        System.out.println("查询");
    }
}
