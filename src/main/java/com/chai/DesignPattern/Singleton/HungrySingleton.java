package com.chai.DesignPattern.Singleton;


//饿汉式
public class HungrySingleton {

    private static final HungrySingleton instance=new HungrySingleton();

    private  HungrySingleton(){};

    public static HungrySingleton getInstance(){
        return instance;
    }
}
