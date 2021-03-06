package com.chai.DesignPattern.adapter.objectadapter;

public class Voltage220v {
    public int output220v(){
        int src=220;
        System.out.println("输出"+src+"伏特");
        return src;
    }
}
