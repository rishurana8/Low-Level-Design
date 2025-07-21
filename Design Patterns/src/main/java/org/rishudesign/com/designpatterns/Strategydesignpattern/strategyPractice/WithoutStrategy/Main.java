package org.rishudesign.com.designpatterns.Strategydesignpattern.strategyPractice.WithoutStrategy;

public class Main {
    public static void main(String args[]){
         PaymentProcessor paymentProcessor = new PaymentProcessor();
         paymentProcessor.processPayment("UPI");
    }
}
