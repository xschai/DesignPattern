package com.chai.DesignPattern.adapter.objectadapter;

public class Phone {
    public void chargiing(Voltage5v voltage5v){
        if (voltage5v.output5v()==5){
            System.out.println("电压5v,可以充电");
        }
        else{
            System.out.println("电压不合适，不可以充电");
        }
    }
}
