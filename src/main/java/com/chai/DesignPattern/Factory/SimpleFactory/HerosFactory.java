package com.chai.DesignPattern.Factory.SimpleFactory;

public class HerosFactory {
    public Hero getDifferentHero(String type){
        if("DaJi".equals(type)){
                return new DaJi();
            }
        else if ("HouYi".equals(type)){
               return new HouYi();
        }
        return null;
    }
}
