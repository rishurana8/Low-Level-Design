package org.rishudesign.com.Designs.ParkingLot.PaymentStrategy.ConcretePaymentStrategies;

import org.rishudesign.com.Designs.ParkingLot.PaymentStrategy.PaymentStrategy;

public class CreditCard implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
