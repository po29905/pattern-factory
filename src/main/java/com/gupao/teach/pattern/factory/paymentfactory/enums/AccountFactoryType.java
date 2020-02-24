package com.gupao.teach.pattern.factory.paymentfactory.enums;

import com.gupao.teach.pattern.factory.paymentfactory.factory.*;

public enum AccountFactoryType {

    AliPay(AliPaymentFactory.class),
    WechatPay(WeChatPaymentFactory.class),
    UnionPay(UnionPaymentFactory.class),
    TransnationalPay(TransnationalPaymentFactory.class);

    private Class<? extends IPaymentFactory> clazz;

    private AccountFactoryType(Class<? extends IPaymentFactory> clazz){
        this.clazz=clazz;
    }

    public Class<? extends IPaymentFactory> getClazz() {
        return clazz;
    }
}
