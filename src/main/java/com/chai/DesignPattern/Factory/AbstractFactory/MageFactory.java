package com.chai.DesignPattern.Factory.AbstractFactory;

public class MageFactory extends HeroFactory{
    @Override
    protected Hero productHero() {
        return new DaJi();
    }
}
