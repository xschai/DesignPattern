package com.chai.DesignPattern.Factory.FactoryMethod;

public class MageFactory extends HeroFactory{
    @Override
    protected Hero productHero() {
        return new DaJi();
    }
}
