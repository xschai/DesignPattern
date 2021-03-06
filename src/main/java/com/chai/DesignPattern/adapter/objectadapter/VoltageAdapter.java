package com.chai.DesignPattern.adapter.objectadapter;

public class VoltageAdapter implements Voltage5v {

    private Voltage220v  sourceV;

    public VoltageAdapter(Voltage220v sourceV){
        this.sourceV=sourceV;
    }
    @Override
    public int output5v() {
        int target = 0;
        if(null != sourceV){
            int source = sourceV.output220v();
            target = source / 44;
        }
        return target;

    }
}
