package com.chai.DesignPattern.adapter.classadaper;

public class VoltageAdapter extends Voltage220v implements Voltage5v{
    @Override
    public int output5v() {
        int source=output220v();
        int target=source/44;
        return target;
    }
}
