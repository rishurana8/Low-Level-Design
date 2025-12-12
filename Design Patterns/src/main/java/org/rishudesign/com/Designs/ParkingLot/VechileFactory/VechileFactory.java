package org.rishudesign.com.Designs.ParkingLot.VechileFactory;


import org.rishudesign.com.Designs.ParkingLot.FareStrategy.ParkingFeeStrategy;
import org.rishudesign.com.Designs.ParkingLot.VechileFactory.ConcreteVechiles.Bike;
import org.rishudesign.com.Designs.ParkingLot.VechileFactory.ConcreteVechiles.Car;

public class VechileFactory {
    public static Vechile createVehicle(String vehicleType, String licensePlate, ParkingFeeStrategy feeStrategy) {
        if (vehicleType.equalsIgnoreCase("Car")) {
            return new Car(licensePlate, vehicleType, feeStrategy);
        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            return new Bike(licensePlate, vehicleType, feeStrategy);
        }
        return null;
    }
}
