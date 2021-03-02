package com.chai.DesignPattern.Decorator;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        description="HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
