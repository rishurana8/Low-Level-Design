package org.rishudesign.com.Designs.ParkingLot.ParkingSpots.ConcreteParkingSpots;

import org.rishudesign.com.Designs.ParkingLot.ParkingSpots.ParkingSpot;
import org.rishudesign.com.Designs.ParkingLot.VechileFactory.Vechile;


public class BikeParkingSpot extends ParkingSpot {

    public BikeParkingSpot(int spotNumber,String spotType){
        super(spotNumber,spotType);
    }

    @Override
    public boolean canParkVechile(Vechile vechile) {
        return "Bike".equalsIgnoreCase(vechile.getVehicleType());
    }
}
