package org.rishudesign.com.Designs.ElevatorSystem;

import org.rishudesign.com.Designs.ElevatorSystem.Enums.Direction;

public class Floor {
    int floorNumber;
    ExternalDispatcher externalDispatcher;

    public Floor(int floorNumber){
        this.floorNumber = floorNumber;
    }

    public void pressButton(Direction direction){
        externalDispatcher.submitExternalRequest(floorNumber,direction);
    }
}
