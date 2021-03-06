package com.chai.DesignPattern.adapter.interfaceadaper;

public class Client {
    public static void main(String[] args) {
        AbstractAdapter abstractAdapter = new AbstractAdapter(){
            @Override
            public void operation1() {
                System.out.println("重写方法一");
            }
        };
        abstractAdapter.operation1();
    }
}
