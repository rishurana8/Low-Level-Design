package org.rishudesign.com.designpatterns.Strategydesignpattern.strategyPractice.WithStrategy;

public class CreditCard implements PaymentStrategy{

    @Override
    public void processPayment(){
        System.out.println("Payment Method is Credit Card");
    }
}
