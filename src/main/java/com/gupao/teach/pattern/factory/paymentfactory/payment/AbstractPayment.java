package com.gupao.teach.pattern.factory.paymentfactory.payment;

public abstract class AbstractPayment {


    protected int accountId;

    protected double balance;

    public abstract void takeOffBalance(double account);

    public abstract void refures(double account);

    public double getBalance(){
        return this.balance;
    }

    public int getAccountId(){
        return this.accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
