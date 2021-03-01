package com.chai.DesignPattern.Strategy;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
