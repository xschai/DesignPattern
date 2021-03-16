package com.chai.DesignPattern.Flyweight;

import java.util.HashMap;

public class WebSiteFactory {
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    public WebSite getWebSiteCategory(String key) {
        if (!pool.containsKey(key)) {
            pool.put(key, new ConcreteWebSite(key));
        }
        return (WebSite) pool.get(key);
    }

    //获得网站分类总数
    public int getWebSiteCount() {
        return pool.size();
    }
}
