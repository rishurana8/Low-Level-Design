package org.rishudesign.com.Designs.ElevatorSystem;

import org.rishudesign.com.Designs.ElevatorSystem.Enums.Direction;

public class ElevatorDisplay {
     int floor;
     Direction direction;

     ElevatorDisplay(int floor , Direction direction){
         this.floor = floor;
         this.direction = direction;
     }

     public void setDisplay(int currentfloor , Direction direction){
         this.floor= currentfloor;
         this.direction = direction;
     }

     public void showDisplay(){
         System.out.println(floor);
         System.out.println(direction);
     }

}
