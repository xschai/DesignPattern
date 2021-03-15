package com.chai.DesignPattern.Bridge;

public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected  void open(){
        brand.opon();
    }
    protected  void close(){
        brand.close();
    }
    protected  void call(){
        brand.call();
    }
}
