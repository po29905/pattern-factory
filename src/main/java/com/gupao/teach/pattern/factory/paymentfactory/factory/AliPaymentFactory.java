package com.gupao.teach.pattern.factory.paymentfactory.factory;

import com.gupao.teach.pattern.factory.paymentfactory.payment.AbstractPayment;
import com.gupao.teach.pattern.factory.paymentfactory.payment.AliPayPayment;

public class AliPaymentFactory implements IPaymentFactory {
    public AbstractPayment getPayment(int accountId) {
        AbstractPayment unionPayment = new AliPayPayment();
        unionPayment.setAccountId(accountId);
        unionPayment.setBalance(Math.random()*30);
        return unionPayment;
    }
}
