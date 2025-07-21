package org.rishudesign.com.designpatterns.Strategydesignpattern.strategyPractice.WithStrategy;

public class ProcessPayment {
    private PaymentStrategy paymentStrategy ;

    ProcessPayment(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentMethod(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }


    public void processPayment(){
        paymentStrategy.processPayment();
    }


}
