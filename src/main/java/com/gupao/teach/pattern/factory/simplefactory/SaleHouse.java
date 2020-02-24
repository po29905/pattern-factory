package com.gupao.teach.pattern.factory.simplefactory;

public class SaleHouse implements House {
    public void getType() {
        System.out.println("我是二手房");
    }

    public int getJiaGe() {
        return 60000;
    }

    public int getMianJi() {
        return 70;
    }
}
