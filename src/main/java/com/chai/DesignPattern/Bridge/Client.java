package com.chai.DesignPattern.Bridge;

public class Client {
    public static void main(String[] args) {
        Phone phone1=new UpRightPhone(new Vivo());
        phone1.open();
        phone1.close();
        phone1.call();
        System.out.println("-----------------------------");
        Phone phone2=new FoldedPhone(new Huawei());
        phone2.open();
        phone2.close();
        phone2.call();
    }
}
