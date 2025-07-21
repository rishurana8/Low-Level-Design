package org.rishudesign.com.designpatterns.Strategydesignpattern.strategyPractice.WithStrategy;

public class PayPal implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Payment method is Paypal");
    }
}
