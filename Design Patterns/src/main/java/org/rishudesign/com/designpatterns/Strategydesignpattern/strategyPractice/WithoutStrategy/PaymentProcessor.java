package org.rishudesign.com.designpatterns.Strategydesignpattern.strategyPractice.WithoutStrategy;

public class PaymentProcessor {
    public void processPayment(String paymentMethod){
        if(paymentMethod.equals("UPI")){
            System.out.println("Payment method used is UPI");
        }else if(paymentMethod.equals("CreditCard")){
            System.out.println("Payment method used is CrediCard");
        }else if(paymentMethod.equals("PayPal")){
            System.out.println("Payment method used is PayPal");
        }
    }
}
