package com.chai.DesignPattern.Factory.AbstractFactory;

public class HouYi implements Hero{
    @Override
    public void buyHeroSuccess() {
        System.out.println("成功购买后羿");
    }

    @Override
    public void buySkinSuccess() {
        System.out.println("成功购买后裔皮肤");
    }
}
