package com.gupao.teach.pattern.factory.simplefactory;

public class HouseFactory {




    public static House getHouse(String type){

        if("sale".equals(type)){
            return new SaleHouse();
        }
        if("rent".equals(type)){
            return new RentHouse();
        }
        return null;
    }

    public static House getHouseByClass(String clazz){
        try {
            Class<?> newClazz = Class.forName(clazz);
            if(newClazz!=null){
                return (House)newClazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static House getHouseByClass(Class<? extends House> clazz){
        if(clazz!=null){
            try {
                House house = clazz.newInstance();
                return house;
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
