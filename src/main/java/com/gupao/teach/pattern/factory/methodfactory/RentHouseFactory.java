package com.gupao.teach.pattern.factory.methodfactory;

import com.gupao.teach.pattern.factory.simplefactory.House;
import com.gupao.teach.pattern.factory.simplefactory.RentHouse;
import com.gupao.teach.pattern.factory.simplefactory.SaleHouse;

public class RentHouseFactory implements HouseFactory {
    public House getHouse() {
        return new RentHouse();
    }
}
