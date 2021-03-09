package com.chai.DesignPattern.proxy.staticproxy;

public class Proxy implements Rent{
    private  Rent host;

    public Proxy() {
    }

    public Proxy(Rent host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        fare();
    }
    //看房
    public void seeHouse(){
        System.out.println("带房客看房");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
}
