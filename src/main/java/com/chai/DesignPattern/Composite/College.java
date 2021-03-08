package com.chai.DesignPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{

    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public College(String name, String des) {
        super(name, des);
    }
    // 重 写 add @Override
    protected void add(OrganizationComponent organizationComponent) {
        //	将来实际业务中，Colleage  的  add  和	University add 不一定完全一样
        organizationComponents.add(organizationComponent);
    }
    // 重 写 remove @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println("--------------" + getName() + "--------------");
            //遍历 organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) { organizationComponent.print();
        }
    }
}
