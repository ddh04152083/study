package com.ddh.demo1;

//代理角色：代理真实角色，一般会做一些附属操作
public class RentProxy implements Rent{

    private Host host;
    public RentProxy(Host host){
        this.host = host;
    }
    public void rent() {
        this.watchHouse();
        host.rent();
        this.SignContract();
        this.fare();
    }

    private void watchHouse(){
        System.out.println("看房");
    }

    private void fare(){
        System.out.println("收取中介费");
    }
    private void SignContract(){
        System.out.println("签合同");
    }
}
