package com.chai.DesignPattern.TemplateMethod.hook;

public class RedBeanSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("加入上好的红豆");
    }
}
