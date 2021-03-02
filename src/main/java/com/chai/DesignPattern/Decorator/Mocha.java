package com.chai.DesignPattern.Decorator;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }



    @Override
    public double cost() {
        return beverage.cost()+0.8;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",mocha";
    }
}
