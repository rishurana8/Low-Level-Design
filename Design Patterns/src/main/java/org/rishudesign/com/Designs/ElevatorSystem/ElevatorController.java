package org.rishudesign.com.Designs.ElevatorSystem;

import org.rishudesign.com.Designs.ElevatorSystem.Enums.Direction;

import java.util.PriorityQueue;

public class ElevatorController {
    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;
    ElevatorCar car;

    ElevatorController(ElevatorCar car){
        this.car = car;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>((a,b) -> b-a); // down k time min heap

    }

    public void submitExternalRequest(int floor , Direction direction){
        if(direction == Direction.DOWN) {
            downMaxPQ.offer(floor);
        } else {
            upMinPQ.offer(floor);
        }

    }

    public void submitInternalRequest(int floor){

    }





}
