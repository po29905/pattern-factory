package com.gupao.teach.pattern.factory.paymentfactory.factory;

import com.gupao.teach.pattern.factory.paymentfactory.payment.AbstractPayment;

public interface IPaymentFactory {


    public AbstractPayment getPayment(int accountId);
}
