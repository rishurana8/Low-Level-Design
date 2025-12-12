package org.rishudesign.com.Designs.ParkingLot.PaymentStrategy.ConcretePaymentStrategies;

import org.rishudesign.com.Designs.ParkingLot.PaymentStrategy.PaymentStrategy;

public class CashPayments implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Cash payment of $" + amount);
    }
}
