package org.rishudesign.com.Designs.ElevatorSystem;
import java.util.*;

public class Building {
    private List<Floor> floorList;

    public Building(List<Floor> floors){
        this.floorList = floors;
    }

    public void addFloor(Floor newFloor){
        floorList.add(newFloor);
    }

    public void removeFloor(Floor removeFloor){
        floorList.remove(removeFloor);
    }

    public List<Floor> getAllFloors(){
        return floorList;
    }
}
