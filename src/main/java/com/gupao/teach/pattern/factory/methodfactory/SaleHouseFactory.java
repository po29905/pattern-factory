package com.gupao.teach.pattern.factory.methodfactory;

import com.gupao.teach.pattern.factory.simplefactory.House;
import com.gupao.teach.pattern.factory.simplefactory.SaleHouse;

public class SaleHouseFactory implements HouseFactory {
    public House getHouse() {
        return new SaleHouse();
    }
}
