package org.rishudesign.com.Designs.ParkingLot.ParkingSpots;


import org.rishudesign.com.Designs.ParkingLot.VechileFactory.Vechile;

public abstract class ParkingSpot {
   private final int spotNumber;
   private boolean isOccupied;
   private Vechile vechile;
   private final String spotType;

    public ParkingSpot(int spotNumber, String spotType) {
        this.spotNumber = spotNumber;
        this.isOccupied = false;
        this.spotType = spotType;
    }

   public boolean isOccupied(){
       return this.isOccupied;
   }

   public abstract boolean canParkVechile(Vechile vechile);

   public void parkVechile(Vechile vechile){
       if(isOccupied){
           throw new IllegalStateException("Spot is already blocked!");
       }
       if(!canParkVechile(vechile)){
           throw new IllegalArgumentException("This spot is not suitable for " + vechile.getVehicleType());
       }
       this.vechile = vechile;
       isOccupied = true;
   }

   public void vacate(){
       if(!isOccupied){
           throw new IllegalStateException("This spot is already vacant");
       }
       this.vechile = null;
       this.isOccupied = false;
   }

   public int getSpotNumber(){
       return this.spotNumber;
   }

   public Vechile getVechile(){
       return this.vechile;
   }

   public String getSpotType(){
       return this.spotType;
   }

}
