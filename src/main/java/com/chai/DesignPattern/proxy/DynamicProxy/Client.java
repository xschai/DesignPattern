package com.chai.DesignPattern.proxy.DynamicProxy;

public class Client {
    public static void main(String[] args) {
        Host host=new Host();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(host);
        Rent proxy = (Rent)pih.getProxy();
        proxy.rent();

    }
}
