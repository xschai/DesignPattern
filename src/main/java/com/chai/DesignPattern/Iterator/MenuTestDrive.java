package com.chai.DesignPattern.Iterator;

public class MenuTestDrive {
       public  static void main(String args[]) {
        //煎饼店菜单
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        //餐厅菜单
        DinerMenu dinerMenu = new DinerMenu();
        //女招待员
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        //打印菜单
        waitress.printMenu();
    }

}
