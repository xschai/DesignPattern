package com.chai.DesignPattern.Factory.SimpleFactory;

public class HouYi implements Hero{
    @Override
    public void buyHero() {
        System.out.println("成功购买后羿");
    }

    @Override
    public void buySink() {
        System.out.println("成功购买后裔皮肤");
    }
}
