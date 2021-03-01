package com.chai.DesignPattern.Strategy;

public class PekingDuck extends Duck{

    public PekingDuck() {
        flyBehavior = new NoFlyBehavior();
        quackBehavior=new Quack();
    }


    @Override
    public void display() {
        System.out.println("北京鸭");

    }
}
