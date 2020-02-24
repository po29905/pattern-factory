package com.gupao.teach.pattern.factory.paymentfactory.factory;

import com.gupao.teach.pattern.factory.paymentfactory.payment.AbstractPayment;
import com.gupao.teach.pattern.factory.paymentfactory.payment.TransnationalPayment;
import com.gupao.teach.pattern.factory.paymentfactory.payment.UnionPayment;

public class TransnationalPaymentFactory implements IPaymentFactory {
    public AbstractPayment getPayment(int accountId) {
        TransnationalPayment unionPayment = new TransnationalPayment();
        unionPayment.setAccountId(accountId);
        unionPayment.setBalance(Math.random()*20);
        return unionPayment;
    }
}
