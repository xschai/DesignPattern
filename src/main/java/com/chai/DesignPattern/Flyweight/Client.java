package com.chai.DesignPattern.Flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite1 = factory.getWebSiteCategory("产品展示");
        webSite1.use(new User("tom"));

        WebSite webSite2 = factory.getWebSiteCategory("产品展示");
        webSite2.use(new User("jack"));

        WebSite webSite3 = factory.getWebSiteCategory("产品展示");
        webSite3.use(new User("marry"));

        WebSite webSite4 = factory.getWebSiteCategory("博客");
        webSite4.use(new User("mack"));

        WebSite webSite5 = factory.getWebSiteCategory("博客");
        webSite5.use(new User("li"));

        WebSite webSite6 = factory.getWebSiteCategory("博客");
        webSite6.use(new User("tang"));

        System.out.println("网站总数为："+factory.getWebSiteCount());
        //可以看出，虽然我们做了6个网站，但网站分类只有2个，实现了共享的目的
    }
}
