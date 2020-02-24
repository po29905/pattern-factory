package com.gupao.teach.pattern.factory.simplefactory;

public class RentHouse implements House {
    public void getType() {
        System.out.println("我是租房");
    }

    public int getJiaGe() {
        return 3000;
    }

    public int getMianJi() {
        return 20;
    }
}
