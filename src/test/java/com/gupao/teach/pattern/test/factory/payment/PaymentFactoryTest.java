package com.gupao.teach.pattern.test.factory.payment;

import com.gupao.teach.pattern.factory.paymentfactory.enums.AccountFactoryType;
import com.gupao.teach.pattern.factory.paymentfactory.factory.IPaymentFactory;
import com.gupao.teach.pattern.factory.paymentfactory.payment.AbstractPayment;

public class PaymentFactoryTest {


    public static void main(String[] args) {

        IPaymentFactory factory=getFactory(AccountFactoryType.AliPay);
        //获取对应账号的支付余额相关信息:
        AbstractPayment payment = factory.getPayment(123456);
        //开始扣钱；
        payment.takeOffBalance(30);
        //有一个订单 操作退款，处理退款逻辑。
        payment.refures(40);
    }



    public static IPaymentFactory getFactory(AccountFactoryType type){

        try {
            IPaymentFactory accountFactory = type.getClazz().newInstance();
            return accountFactory;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
