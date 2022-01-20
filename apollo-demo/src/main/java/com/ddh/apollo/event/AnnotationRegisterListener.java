package com.ddh.apollo.event;

import com.ddh.apollo.entity.UserBean;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationRegisterListener {

    @EventListener
    public void register(UserRegisterEvent userRegisterEvent) {
        UserBean user = userRegisterEvent.getUser();
        System.out.println("@EventListener注册信息，用户名：" + user.getName() + "，密码：" + user.getPassword());
    }
}
