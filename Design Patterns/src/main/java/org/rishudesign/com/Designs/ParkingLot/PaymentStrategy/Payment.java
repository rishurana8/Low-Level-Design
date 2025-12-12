package org.rishudesign.com.Designs.ParkingLot.PaymentStrategy;

public class Payment {
    private double amount;
    private PaymentStrategy paymentStrategy;

    public  Payment(double amount,PaymentStrategy paymentStrategy){
        this.amount = amount;
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        if(amount>0){
            paymentStrategy.processPayment(amount);

        }else{
            System.out.println("Amount not valid!");
        }
    }
}
