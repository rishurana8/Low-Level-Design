package org.rishudesign.com.Designs.ElevatorSystem;
import java.util.*;
import java.util.ArrayList;

public class ElevatorCreater {
    static List<ElevatorController> elevatorControllerList = new ArrayList<>();

    static{
        ElevatorCar elevatorCar1 = new ElevatorCar();
        elevatorCar1.id = 1;
        ElevatorController  elevatorController1 = new ElevatorController(elevatorCar1);

        ElevatorCar elevatorCar2 = new ElevatorCar();
        elevatorCar2.id = 2;
        ElevatorController elevatorController2 = new ElevatorController(elevatorCar2);

        elevatorControllerList.add(elevatorController1);
        elevatorControllerList.add(elevatorController2);
    }
}
