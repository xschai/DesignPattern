package com.chai.DesignPattern.Mediator;

public class Client {
    public static void main(String[] args) {
        //创建具体中介者
        ConcreteMediator cm = new ConcreteMediator();
        //创建具体同事
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1();
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2();
        //注册同事
        cm.register(concreteColleague1);
        cm.register(concreteColleague2);


        concreteColleague1.send();
        System.out.println("--------------------");
        concreteColleague2.send();
    }
}
