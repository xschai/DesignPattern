package com.chai.DesignPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent{

    List<OrganizationComponent> organizationComponents= new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }
    // 重 写 add @Override
    protected void add(OrganizationComponent organizationComponent) {
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
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
