package com.chai.DesignPattern.Strategy;

public class ToyDuck extends Duck{

    public ToyDuck(){
        flyBehavior=new NoFlyBehavior();
        quackBehavior=new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }



}
