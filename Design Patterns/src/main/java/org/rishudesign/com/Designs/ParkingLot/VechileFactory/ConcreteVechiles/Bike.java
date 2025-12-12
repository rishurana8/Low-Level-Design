package org.rishudesign.com.Designs.ParkingLot.VechileFactory.ConcreteVechiles;


import org.rishudesign.com.Designs.ParkingLot.FareStrategy.ParkingFeeStrategy;
import org.rishudesign.com.Designs.ParkingLot.VechileFactory.Vechile;

public class Bike extends Vechile {
    public Bike(String licesnePlate, String vechileType, ParkingFeeStrategy parkingFeeStrategy){
            super(licesnePlate,vechileType,parkingFeeStrategy);
    }
}
