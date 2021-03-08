package com.chai.DesignPattern.Iterator;

import java.util.Iterator;


//餐厅菜单迭代器
public class DinerMenuIterator implements Iterator {

    //菜品数组
    MenuItem[] items;
    //记录当前数组遍历的位置
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    //取得下一个元素
    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    //是否还有下一个元素
    @Override
    public boolean hasNext() {

        //如果到达数组末尾，或者下一项是null，那么都认为无下一个元素
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

}
