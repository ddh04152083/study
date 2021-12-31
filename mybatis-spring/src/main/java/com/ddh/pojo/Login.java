package com.ddh.pojo;

import lombok.Data;

@Data
public class Login {
    private long id;

    private String password;

    private String type;

    private String username;


    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
