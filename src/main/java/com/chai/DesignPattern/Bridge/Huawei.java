package com.chai.DesignPattern.Bridge;

public class Huawei implements Brand{

    @Override
    public void opon() {
        System.out.println("huawei开机");
    }

    @Override
    public void close() {
        System.out.println("huawei关机");
    }

    @Override
    public void call() {
        System.out.println("huawei打电话");
    }
}
