package com.chai.DesignPattern.Singleton;

//枚举实现单例
public enum EnumSingletion {
    INSTANCE;
    public EnumSingletion getInstance(){
        return INSTANCE;
    }
}
