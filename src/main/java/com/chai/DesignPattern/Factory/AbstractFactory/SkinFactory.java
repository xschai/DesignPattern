package com.chai.DesignPattern.Factory.AbstractFactory;

public class SkinFactory extends SkinAbStractFactory{
    @Override
    public Sink getSkin(String skinType) {
        if("HouYi".equals(skinType)){
            return new HouYiSkin();
        }else if("DaJi".equals(skinType)){
            return new DaJiSkin();
        }
        return null;
    }
}
