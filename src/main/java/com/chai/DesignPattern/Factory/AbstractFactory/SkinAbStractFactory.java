package com.chai.DesignPattern.Factory.AbstractFactory;

public abstract class SkinAbStractFactory implements MarketFactory{
    public abstract Sink getSkin(String skinType);
}
