package com.chai.DesignPattern.Decorator;

//装饰者类，调料
public class Milk extends CondimentDecorator{

    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.4;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",mike";
    }
}
