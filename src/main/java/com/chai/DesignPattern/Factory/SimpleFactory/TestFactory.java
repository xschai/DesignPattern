package com.chai.DesignPattern.Factory.SimpleFactory;

public class TestFactory {
    public static void main(String[] args) {

        Hero hero1 = HerosFactory.getDifferentHero("DaJi");
        hero1.buyHero();
        hero1.buySink();
        System.out.println("/////////////////////////////////////");
        Hero hero2 = HerosFactory.getDifferentHero("HouYi");
        hero2.buyHero();
        hero2.buySink();
    }
}
