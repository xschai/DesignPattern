package com.chai.DesignPattern.builder;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {

        System.out.println(" 高楼的打地基 100 米 ");
    }


    @Override
    public void buildWalls() {
        System.out.println(" 高楼的砌墙 20cm ");
    }


    @Override
    public void roofed() {

        System.out.println(" 高楼的透明屋顶 ");
    }

}
