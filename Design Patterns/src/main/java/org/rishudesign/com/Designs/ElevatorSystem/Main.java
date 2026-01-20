package org.rishudesign.com.Designs.ElevatorSystem;
import java.util.*;
import org.rishudesign.com.Designs.ElevatorSystem.Enums.Direction;

public class Main {
    public static void main(String[] args) {
        // Initialize the external dispatcher (shared for all floors)
        ExternalDispatcher externalDispatcher = new ExternalDispatcher();

        List<Floor> floorList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            floorList.add(new Floor(i, externalDispatcher));
        }

        Building building = new Building(floorList);

        // Simulate some button presses for demonstration
        System.out.println("Simulating elevator requests:");
        building.getAllFloors().get(0).pressButton(Direction.UP); // Floor 1 up
        building.getAllFloors().get(4).pressButton(Direction.DOWN); // Floor 5 down
    }
}
