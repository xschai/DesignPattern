package com.chai.DesignPattern.Factory.SimpleFactory;

public class DaJi implements Hero{
    @Override
    public void buyHero() {
        System.out.println("成功购买妲己");
    }

    @Override
    public void buySink() {
        System.out.println("成功购买妲己皮肤");
    }
}
