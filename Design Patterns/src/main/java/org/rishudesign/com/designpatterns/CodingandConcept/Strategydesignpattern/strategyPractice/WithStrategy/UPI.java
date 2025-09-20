package org.rishudesign.com.designpatterns.CodingandConcept.Strategydesignpattern.strategyPractice.WithStrategy;

public class UPI implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Payment method is UPI");
    }
}
