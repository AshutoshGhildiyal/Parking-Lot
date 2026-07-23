package com.ashu.strategy.payment;

public class UPIPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("UPI paid: "+ amount);
    }
}
