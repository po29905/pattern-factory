package com.gupao.teach.pattern.factory.paymentfactory.payment;

public class WeChatPayment extends AbstractPayment {

    public void takeOffBalance(double account) {
        if(this.getBalance()-account<0){
            System.out.println("微信账号:"+this.getAccountId()+" 余额不足，交易失败");
            return;
        }

        System.out.println("扣除 微信账号:"+this.getAccountId()+" 余额，当前余额："+this.getBalance()+"，扣除金额："+account+"，扣除后余额："+(this.getBalance()-account));
        this.setBalance(this.getBalance()-account);

    }

    public void refures(double account) {
        System.out.println("退回 微信账号:"+this.getAccountId()+" 金额，当前余额："+this.getBalance()+"，退回金额："+account+"，扣除后余额："+(this.getBalance()-account));
        this.setBalance(this.getBalance()+account);
    }
}
