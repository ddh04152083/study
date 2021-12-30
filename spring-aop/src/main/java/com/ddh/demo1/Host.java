package com.ddh.demo1;
//真实角色：被代理的角色
public class Host implements Rent {
    public void rent() {
        System.out.println("房东出租房子");
    }
}
