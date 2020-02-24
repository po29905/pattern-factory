package com.gupao.teach.pattern.test.factory.abstractfactory;

import com.gupao.teach.pattern.factory.abstractfactory.AppleFactory;
import com.gupao.teach.pattern.factory.abstractfactory.HuaWeiFactory;
import com.gupao.teach.pattern.factory.abstractfactory.XiaoMiFactory;
import com.gupao.teach.pattern.factory.abstractfactory.phone.HuaWeiPhone;
import com.gupao.teach.pattern.factory.abstractfactory.phone.Phone;
import com.gupao.teach.pattern.factory.methodfactory.RentHouseFactory;
import com.gupao.teach.pattern.factory.methodfactory.SaleHouseFactory;
import com.gupao.teach.pattern.factory.simplefactory.House;

import java.util.Arrays;

public class AbstractFacotyTest {

    public static void main(String[] args) {
        Phone phone=new HuaWeiFactory().getPhone();
        Phone phone1=new XiaoMiFactory().getPhone();
        Phone phone2=new AppleFactory().getPhone();
        phone.getInterfact();
        phone1.getInterfact();
        phone2.getInterfact();
    }
}
