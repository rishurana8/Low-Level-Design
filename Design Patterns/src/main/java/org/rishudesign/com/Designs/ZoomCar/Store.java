package org.rishudesign.com.Designs.ZoomCar;
import java.util.*;

public class Store {
    Long storeId;
    String storeName;
    Location location;
    VechileInventory vechileInventory;
    List<Reservation> reservationList;

    public Store(Long storeId, String storeName, Location location) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.location = location;
        this.reservationList = new ArrayList<>();
    }

    public void addVechile(Vechile vechile) {
        vechileInventory.addVechile(vechile);
    }

    public void removeVechile(Vechile vechile) {
        vechileInventory.removeVechile(vechile);
    }

    public List<Vechile> getAvailableVechiles(VechileType vechileType) {
        return vechileInventory.getAvailabeVechile(vechileType);
    }

    public void setVechiles(List<Vechile>vechiles){
        vechileInventory = new VechileInventory(vechiles);
    }


    public Reservation createReservation(Vechile vechile,User user){
        Reservation reservation = new Reservation();
        Long reservationId = reservation.ReserveVechile(vechile,user);
        reservationList.add(reservation);
        return reservation;
    }

    public Boolean cancelResevation(Long reservationId){
        reservationList.stream()
                .filter(r -> r.reservationId == reservationId)
                .anyMatch(r -> r.cancelReservation());
        reservationList.remove(
                reservationList.stream()
                        .filter(r -> r.reservationId == reservationId)
                        .findFirst()
                        .orElse(null)
        );
        return true;

    }



}
