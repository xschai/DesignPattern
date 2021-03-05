package com.chai.DesignPattern.Singleton;

//静态内部类实现单例
public class StaticClassSingletion {
    private StaticClassSingletion(){}

    private static class  SingletionInstance{
        private static final StaticClassSingletion INSTANCE=new StaticClassSingletion();
    }

    public static StaticClassSingletion getInstance(){
        return SingletionInstance.INSTANCE;
    }
}
