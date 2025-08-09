package org.rishudesign.com.Designs.ElevatorSystem;

public class InternalButtons {
    InternalButtonDispatcher dispatcher = new InternalButtonDispatcher();

    int[] availableButtons = {1,2,3,4,5,6,7,8,9};

    int buttonSelected;

    void pressButton(int destination, ElevatorCar car){
        dispatcher.submitInternalRequest(destination,car);
    }
}
