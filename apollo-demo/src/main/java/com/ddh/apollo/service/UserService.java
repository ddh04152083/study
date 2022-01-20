package com.ddh.apollo.service;

import com.ddh.apollo.entity.UserBean;
import com.ddh.apollo.event.UserRegisterEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private ApplicationContext applicationContext;

    public void register(UserBean user) {
        applicationContext.publishEvent(new UserRegisterEvent(this, user));
    }
}
