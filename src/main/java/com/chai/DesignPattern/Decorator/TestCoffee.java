package com.chai.DesignPattern.Decorator;

public class TestCoffee {
    public static void main(String[] args) {

        //什么都不加
        Beverage houseBlend=new HouseBlend();
        System.out.println(houseBlend.getDescription()+"$"+houseBlend.cost());
        System.out.println("///////////////////////////////");



        //加牛奶、摩卡
       Beverage beverage=new DarkRoast();
       beverage=new Milk(beverage);
       beverage=new Mocha(beverage);
        System.out.println(beverage.getDescription()+"$"+beverage.cost());
    }
}
