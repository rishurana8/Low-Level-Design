package org.rishudesign.com.Designs.ElevatorSystem;

import org.rishudesign.com.Designs.ElevatorSystem.Enums.Direction;

public class Floor {
    private int floorNumber;
    private ExternalDispatcher externalDispatcher;

    public Floor(int floorNumber, ExternalDispatcher externalDispatcher){
        this.floorNumber = floorNumber;
        this.externalDispatcher = externalDispatcher;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void pressButton(Direction direction){
        if (externalDispatcher != null) {
            externalDispatcher.submitExternalRequest(floorNumber, direction);
        } else {
            System.out.println("ExternalDispatcher not initialized for floor " + floorNumber);
        }
    }
}
