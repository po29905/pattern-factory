package com.gupao.teach.pattern.factory.paymentfactory.factory;

import com.gupao.teach.pattern.factory.paymentfactory.payment.AbstractPayment;
import com.gupao.teach.pattern.factory.paymentfactory.payment.WeChatPayment;

public class WeChatPaymentFactory implements IPaymentFactory {
    public AbstractPayment getPayment(int accountId) {
        AbstractPayment unionPayment = new WeChatPayment();
        unionPayment.setAccountId(accountId);
        unionPayment.setBalance(Math.random()*30);
        return unionPayment;
    }
}
