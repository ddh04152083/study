package com.ddh.pojo;

import org.springframework.stereotype.Component;

@Component
public class User {

    private String name = "ddh";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
