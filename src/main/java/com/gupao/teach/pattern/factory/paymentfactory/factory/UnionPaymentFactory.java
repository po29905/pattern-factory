package com.gupao.teach.pattern.factory.paymentfactory.factory;

import com.gupao.teach.pattern.factory.paymentfactory.payment.AbstractPayment;
import com.gupao.teach.pattern.factory.paymentfactory.payment.UnionPayment;

public class UnionPaymentFactory implements IPaymentFactory {
    public AbstractPayment getPayment(int accountId) {
        UnionPayment unionPayment = new UnionPayment();
        unionPayment.setAccountId(accountId);
        unionPayment.setBalance(Math.random()*10);
        return unionPayment;
    }
}
