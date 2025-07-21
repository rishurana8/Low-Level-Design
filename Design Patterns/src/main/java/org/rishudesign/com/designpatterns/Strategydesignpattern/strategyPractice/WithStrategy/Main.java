package org.rishudesign.com.designpatterns.Strategydesignpattern.strategyPractice.WithStrategy;

public class Main {
    public static void main(){
        PaymentStrategy creditCard = new CreditCard();

        PaymentStrategy UPI = new UPI();


        ProcessPayment processPayment  = new ProcessPayment(creditCard);

        processPayment.processPayment();

        processPayment.setPaymentMethod(UPI);

        processPayment.processPayment();

    }
}
