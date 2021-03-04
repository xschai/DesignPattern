package com.chai.DesignPattern.Factory.AbstractFactory;

public class HeroFactory extends HeroAbStractFactory{
    @Override
    public Hero getHero(String heroType) {
        if("HouYi".equals(heroType)){
            return new HouYiHero();
        }else if("DaJi".equals(heroType)){
            return new DaJiHero();
        }
        return null;
    }
}
