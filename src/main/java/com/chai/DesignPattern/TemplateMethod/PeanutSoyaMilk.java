package com.chai.DesignPattern.TemplateMethod;

public class PeanutSoyaMilk extends SoyaMilk{
    @Override
    void addCondiments() {
        System.out.println("加入上好的花生");
    }
}
