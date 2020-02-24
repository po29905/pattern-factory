package com.gupao.teach.pattern.factory.abstractfactory.phone;

import com.gupao.teach.pattern.factory.abstractfactory.phone.Phone;

public class HuaWeiPhone implements Phone {
    public void getInterfact() {
        System.out.println("我是华为手机，接口 type-c");
    }
}
