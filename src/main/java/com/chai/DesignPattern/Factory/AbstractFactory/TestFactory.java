package com.chai.DesignPattern.Factory.AbstractFactory;

public class TestFactory {
    public static void main(String[] args) {
        HeroFactory heroFactory = (HeroFactory) FactoryProduct.getFactoryByType("HeroFactory");
        Hero hero = heroFactory.getHero("DaJi");
        hero.haveHero();
        SkinFactory skinFactory = (SkinFactory) FactoryProduct.getFactoryByType("SkinFactory");
        Sink skin = skinFactory.getSkin("DaJi");
        skin.haveSkin();
    }
}
