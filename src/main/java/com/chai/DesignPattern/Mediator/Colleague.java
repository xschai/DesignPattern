package com.chai.DesignPattern.Mediator;
//抽象同事类
public abstract class Colleague {
    protected Mediator mediator;
    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void receive();//接收
    public abstract void send();//发送

}
