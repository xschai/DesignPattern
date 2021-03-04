package com.chai.DesignPattern.Factory.AbstractFactory;

public abstract class HeroAbStractFactory implements  MarketFactory{
    public abstract Hero getHero(String heroType);
}
