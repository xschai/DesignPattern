package com.chai.DesignPattern.Factory.FactoryMethod;

public class TestFatcoryMethod {
    public static void main(String[] args) {
        Hero hero1=new ArrowFactory().productHero();
        hero1.buyHeroSuccess();
        hero1.buySkinSuccess();
        System.out.println("///////////////////////////");
        Hero hero2=new MageFactory().productHero();
        hero2.buyHeroSuccess();
        hero2.buySkinSuccess();

    }
}
