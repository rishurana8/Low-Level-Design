package org.rishudesign.com.Designs.ParkingLot.VechileFactory.ConcreteVechiles;


import org.rishudesign.com.Designs.ParkingLot.FareStrategy.ParkingFeeStrategy;
import org.rishudesign.com.Designs.ParkingLot.VechileFactory.Vechile;

public class Car extends Vechile {
    public Car(String licensePlate, String vehicleType, ParkingFeeStrategy feeStrategy) {
        super(licensePlate, vehicleType, feeStrategy);
    }
}
