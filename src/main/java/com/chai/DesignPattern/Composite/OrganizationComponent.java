package com.chai.DesignPattern.Composite;

public abstract class OrganizationComponent {
    private String name; // 名 字

    private String des; // 说 明



    //默认实现
    protected	void add(OrganizationComponent organizationComponent) {

        throw new UnsupportedOperationException();
    }

    //默认实现
    protected	void remove(OrganizationComponent organizationComponent) {

        throw new UnsupportedOperationException();
    }

    //构造器
    public OrganizationComponent(String name, String des) { super();
        this.name = name; this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    //方法 print,  做成抽象的,  子类都需要实现
    protected abstract void print();
}
