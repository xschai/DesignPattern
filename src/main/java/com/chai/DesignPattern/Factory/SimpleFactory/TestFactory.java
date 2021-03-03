package com.chai.DesignPattern.Factory.SimpleFactory;

public class TestFactory {
    public static void main(String[] args) {
        HerosFactory herosFactory = new HerosFactory();
        Hero hero1 = herosFactory.getDifferentHero("DaJi");
        hero1.buyHero();
        hero1.buySink();
        System.out.println("/////////////////////////////////////");
        Hero hero2 = herosFactory.getDifferentHero("HouYi");
        hero2.buyHero();
        hero2.buySink();
    }
}
