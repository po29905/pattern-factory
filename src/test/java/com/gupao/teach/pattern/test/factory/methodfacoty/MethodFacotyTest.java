package com.gupao.teach.pattern.test.factory.methodfacoty;

import com.gupao.teach.pattern.factory.methodfactory.RentHouseFactory;
import com.gupao.teach.pattern.factory.methodfactory.SaleHouseFactory;
import com.gupao.teach.pattern.factory.simplefactory.House;
import com.gupao.teach.pattern.factory.simplefactory.HouseFactory;
import com.gupao.teach.pattern.factory.simplefactory.RentHouse;
import com.gupao.teach.pattern.factory.simplefactory.SaleHouse;

import java.util.Arrays;

public class MethodFacotyTest {

    public static void main(String[] args) {
        House rentHouse = new RentHouseFactory().getHouse();
        rentHouse.getType();
        System.out.println(rentHouse.getClass()+" jiage = " + rentHouse.getJiaGe()+" mianj ="+rentHouse.getMianJi());
        House saleHouse = new SaleHouseFactory().getHouse();
        saleHouse.getType();
        System.out.println(saleHouse.getClass()+" jiage = " + saleHouse.getJiaGe()+" mianj ="+saleHouse.getMianJi());
    }
}
