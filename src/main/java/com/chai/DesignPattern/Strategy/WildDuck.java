package com.chai.DesignPattern.Strategy;

public class WildDuck extends Duck{

    public WildDuck(){
        flyBehavior=new GoodFlyBehavior();
        quackBehavior=new Quack();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭");
    }

}
