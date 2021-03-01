package com.chai.DesignPattern.Strategy;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    public abstract void display();

    public void quack(){
       if(quackBehavior !=null){
           quackBehavior.quack();
       }
    }

    public void fly(){
        if( flyBehavior !=null){
           flyBehavior.fly();
        }
    }

    public void swim(){
        System.out.println("游泳");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior=fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior=qb;
    }
}
