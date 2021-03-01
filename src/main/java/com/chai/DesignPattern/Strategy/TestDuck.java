package com.chai.DesignPattern.Strategy;

public class TestDuck {
    public static void main(String[] args) {
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.quack();
        pekingDuck.fly();
        System.out.println(".......................");
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();
        toyDuck.setFlyBehavior(new GoodFlyBehavior());
        toyDuck.fly();
    }
}
