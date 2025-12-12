package org.rishudesign.com.Designs.ParkingLot;
import java.util.*;

import org.rishudesign.com.Designs.ParkingLot.CommonEnum.DurationType;
import org.rishudesign.com.Designs.ParkingLot.FareStrategy.ConcreteStrategies.BasicHourlyRateStrategy;
import org.rishudesign.com.Designs.ParkingLot.FareStrategy.ConcreteStrategies.PremiumRateStrategy;
import org.rishudesign.com.Designs.ParkingLot.FareStrategy.ParkingFeeStrategy;
import org.rishudesign.com.Designs.ParkingLot.ParkingLotController.ParkingLot;
import org.rishudesign.com.Designs.ParkingLot.ParkingSpots.ConcreteParkingSpots.BikeParkingSpot;
import org.rishudesign.com.Designs.ParkingLot.ParkingSpots.ConcreteParkingSpots.CarParkingSpot;
import org.rishudesign.com.Designs.ParkingLot.ParkingSpots.ParkingSpot;
import org.rishudesign.com.Designs.ParkingLot.PaymentStrategy.ConcretePaymentStrategies.CashPayments;
import org.rishudesign.com.Designs.ParkingLot.PaymentStrategy.ConcretePaymentStrategies.CreditCard;
import org.rishudesign.com.Designs.ParkingLot.PaymentStrategy.PaymentStrategy;
import org.rishudesign.com.Designs.ParkingLot.VechileFactory.Vechile;
import org.rishudesign.com.Designs.ParkingLot.VechileFactory.VechileFactory;

public class Main {
    public static void main(String args[]){
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        parkingSpots.add(new CarParkingSpot(1, "Car"));
        parkingSpots.add(new CarParkingSpot(2,"Car"));
        parkingSpots.add(new BikeParkingSpot(3, "Bike"));
        parkingSpots.add(new BikeParkingSpot(4, "Bike"));

        ParkingLot parkingLot = new ParkingLot(parkingSpots);

        ParkingFeeStrategy basicHourlyRateStrategy = new BasicHourlyRateStrategy();
        ParkingFeeStrategy premiumRateStrategy = new PremiumRateStrategy();

        Vechile car1 = VechileFactory.createVehicle("Car", "CAR123", basicHourlyRateStrategy);
        Vechile car2 = VechileFactory.createVehicle("Car", "CAR345", basicHourlyRateStrategy);

        Vechile bike1 = VechileFactory.createVehicle("Bike", "BIKE456", premiumRateStrategy);
        Vechile bike2 = VechileFactory.createVehicle("Bike", "BIKE123", premiumRateStrategy);


        ParkingSpot carSpot = parkingLot.parkVechile(car1);
        ParkingSpot carSpot2 = parkingLot.parkVechile(car2);

        ParkingSpot bikeSpot = parkingLot.parkVechile(bike1);
        ParkingSpot bikeSpot2 = parkingLot.parkVechile(bike2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select payment method for your vehicle:");
        System.out.println("1. Credit Card");
        System.out.println("2. Cash");

        int paymentMethod = scanner.nextInt();

        if(carSpot!=null){
            double carFee = car1.calculateFee(2, DurationType.HOURS);
            PaymentStrategy carPayment = getPaymentStrategy(paymentMethod,carFee);
            carPayment.processPayment(carFee);
            parkingLot.vacateSpot(carSpot,car1);
        }
        if (bikeSpot != null) {
            // Calculate fee using the specific strategy for the vehicle
            double bikeFee = bike1.calculateFee(3, DurationType.HOURS);
            PaymentStrategy bikePaymentStrategy =
                    getPaymentStrategy(paymentMethod, bikeFee);
            bikePaymentStrategy.processPayment(bikeFee);
            parkingLot.vacateSpot(bikeSpot, bike1);
        }
        scanner.close();


    }
    private static PaymentStrategy getPaymentStrategy(
            int paymentMethod, double fee) {
        switch (paymentMethod) {
            case 1:
                return new CreditCard();
            case 2:
                return new CashPayments();
            default:
                System.out.println("Invalid choice! Default to Credit card payment.");
                return new CreditCard();
        }
    }
}

