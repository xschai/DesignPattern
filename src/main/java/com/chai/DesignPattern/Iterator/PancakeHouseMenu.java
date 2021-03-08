package com.chai.DesignPattern.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

//煎饼店菜单类
public class PancakeHouseMenu implements Menu{


    //使用ArrayList装载菜品
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        //调用addItem添加菜品
        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        //放入集合
        menuItems.add(menuItem);
    }

    //返回全部菜品
//    public ArrayList<MenuItem> getMenuItems() {
//        return menuItems;
//    }

    // other menu methods here
    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
