package org.rishudesign.com.Designs.ParkingLot.ParkingLotController;
import java.util.*;
import org.rishudesign.com.Designs.ParkingLot.ParkingSpots.ParkingSpot;
import org.rishudesign.com.Designs.ParkingLot.VechileFactory.Vechile;


public class ParkingLot {
    List<ParkingSpot>parkingSpots;

    public ParkingLot(List<ParkingSpot>parkingSpots){
        this.parkingSpots = parkingSpots;
    }


    public ParkingSpot findAvailableSpot(String vechileType){
        for(ParkingSpot spot: parkingSpots){
            if(!spot.isOccupied() && spot.getSpotType().equalsIgnoreCase(vechileType)){
                return spot;
            }
        }
        return null;
    }

    public ParkingSpot parkVechile(Vechile vechile){
        ParkingSpot spot = findAvailableSpot(vechile.getVehicleType());
        if(spot!=null){
            spot.parkVechile(vechile);
            System.out.println(
                    "Vehicle parked successfully in spot: " + spot.getSpotNumber());
            return spot;
        }

        System.out.println(
                "Vehicle parked successfully in spot: " + spot.getSpotNumber());
        return spot;
    }

    public void vacateSpot(ParkingSpot spot, Vechile vechile){
        if(spot!=null && spot.isOccupied() && spot.getVechile().equals((vechile))){
            spot.vacate();
            System.out.println(vechile.getVehicleType()
                    + " vacated the spot: " + spot.getSpotNumber());
        }else{
            System.out.println("Invalid operation! Either the spot is already vacant "
                    + "or the vehicle does not match.");
        }
    }


    public ParkingSpot getSpotByNumber(int spotNumber){
        for(ParkingSpot spot: parkingSpots){
            if(spot.getSpotNumber()==spotNumber){
                return spot;
            }

        }
        return null;
    }

    public List<ParkingSpot> getParkingSpots(){
        return this.parkingSpots;
    }

}
