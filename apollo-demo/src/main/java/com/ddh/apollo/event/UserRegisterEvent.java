package com.ddh.apollo.event;

import com.ddh.apollo.entity.UserBean;
import org.springframework.context.ApplicationEvent;

public class UserRegisterEvent extends ApplicationEvent {

    private UserBean user;

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public UserRegisterEvent(Object source, UserBean user) {
        super(source);
        this.user = user;
    }
}
