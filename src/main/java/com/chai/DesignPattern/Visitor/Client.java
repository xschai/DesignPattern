package com.chai.DesignPattern.Visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        System.out.println("-------------成功------------");
        objectStructure.display(new Success());
        System.out.println("-------------失败------------");
        Fail fail = new Fail();
        objectStructure.display(fail);
    }
}
