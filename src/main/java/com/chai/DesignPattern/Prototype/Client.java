package com.chai.DesignPattern.Prototype;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.friend=new Sheep("jack",2,"黑色");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2=(Sheep)sheep.clone();
        System.out.println("sheep1 =" + sheep1+" friend="+sheep1.friend.hashCode() );
        System.out.println("sheep2 =" + sheep2+" friend="+sheep2.friend.hashCode() );
        //默认浅拷贝，克隆的是同一个对象
    }
}
