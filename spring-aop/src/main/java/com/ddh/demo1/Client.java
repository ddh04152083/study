package com.ddh.demo1;

/**
 * 好处：１．可以使真实角色的操作更加纯粹，不需要关注一些公共的业务
 * 　　　２．公共业务交给代理角色，实现业务的分工
 * 　　　３．公共业务发生关系时，更便于维护
 * 缺点：一个真实角色就会产生一个代理角色；代码量会翻倍开发效率很变低
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        RentProxy rentProxy= new RentProxy(host);
        rentProxy.rent();
    }
}
