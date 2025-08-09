package org.rishudesign.com.Designs.ElevatorSystem;

import org.rishudesign.com.Designs.ElevatorSystem.Enums.Direction;
import org.rishudesign.com.Designs.ElevatorSystem.Enums.ElevatorState;

public class ElevatorCar {
    int id;
    ElevatorDisplay display;
    int floor;
    ElevatorState elevatorState;
    InternalButtons button;
    Direction direction;

    public ElevatorCar(){
        display = new ElevatorDisplay(floor,direction);
        elevatorState = ElevatorState.IDLE;
        direction = Direction.UP;
        button = new InternalButtons();

    }

    public void showDisplay(){
        display.showDisplay();
    }

    public void pressButton(int destination){
        button.pressButton(destination,this);
    }

   public void setDisplay(){
        display.setDisplay(floor,direction);
   }

   boolean moveElevator(Direction dir, int destinationFloor){
       int startFloor = floor;
       if(dir == Direction.UP) {
           for(int i = startFloor; i<=destinationFloor; i++) {

               this.floor = startFloor;
               setDisplay();
               showDisplay();
               if(i == destinationFloor) {
                   return true;
               }
           }
       }

       if(dir == Direction.DOWN) {
           for(int i = startFloor; i>=destinationFloor; i--) {

               this.floor = startFloor;
               setDisplay();
               showDisplay();
               if(i == destinationFloor) {
                   return true;
               }
           }
       }
       return false;

   }

}
