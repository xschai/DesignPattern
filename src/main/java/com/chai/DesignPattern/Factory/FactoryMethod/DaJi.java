package com.chai.DesignPattern.Factory.FactoryMethod;

public class DaJi implements Hero{
    @Override
    public void buyHeroSuccess() {
        System.out.println("成功购买妲己");
    }

    @Override
    public void buySkinSuccess() {
        System.out.println("成功购买妲己皮肤");
    }
}
