package com.gupao.teach.pattern.test.factory.simplefacoty;

import com.gupao.teach.pattern.factory.simplefactory.House;
import com.gupao.teach.pattern.factory.simplefactory.HouseFactory;
import com.gupao.teach.pattern.factory.simplefactory.RentHouse;
import com.gupao.teach.pattern.factory.simplefactory.SaleHouse;

public class SimpleFacotyTest {
    //简单工厂方法。适用场景：工厂类创建的对象较少。客户端无需关心创建对象过程 只需要传入参数
    //优点 只需要传入指定得参数就可以返回相应得对象，无需关心创建细节。
    //工厂方法 业务过重，新加类需要改造现有逻辑 违背开闭原则。不扩展过于复杂得产品结构。
    public static void main(String[] args) {
        String[] houseTypes = {"sale", "rent"};
        for (String houseType : houseTypes) {
            House house = HouseFactory.getHouse(houseType);
            house.getType();
            System.out.print(houseType + " jiage = " + house.getJiaGe() + " ");
            System.out.println(houseType + " mianji = " + house.getMianJi());
        }
        String[] houseClazzes = {"com.gupao.teach.pattern.factory.simplefactory.SaleHouse", "com.gupao.teach.pattern.factory.simplefactory.RentHouse"};
        for (String houseClazz : houseClazzes) {
            House house = HouseFactory.getHouseByClass(houseClazz);
            house.getType();
            System.out.print(houseClazz + " jiage = " + house.getJiaGe() + " ");
            System.out.println(houseClazz + " mianji = " + house.getMianJi());
        }
        Class[] clazzs = new Class[]{SaleHouse.class, RentHouse.class};
        for (Class houseClazz : clazzs) {
            House house = HouseFactory.getHouseByClass(houseClazz);
            house.getType();
            System.out.print(houseClazz + " jiage = " + house.getJiaGe() + " ");
            System.out.println(houseClazz + " mianji = " + house.getMianJi());
        }
    }
}
