package com.chai.DesignPattern.TemplateMethod.hook;

public class Milk extends SoyaMilk{
    @Override
    void addCondiments() {

    }
    @Override
    boolean customerWantCondiments(){
        return false;
    }
}
