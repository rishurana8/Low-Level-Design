package org.rishudesign.com.Designs.ZoomCar;

import java.util.Date;

public class Reservation {
    Long reservationId;
    Vechile vechile;
    Date reservationFrom;
    Date reservationTo;
    ReservationStatus reservationStatus;
    User user;

    Reservation(){

    }

    public Boolean cancelReservation(){
        this.reservationStatus = ReservationStatus.CANCELLED;
        this.vechile.status = VechileStatus.AVAILABLE;
        return true;
    }

    public Double calculateCost(){
        long diffInMillies = Math.abs(reservationTo.getTime() - reservationFrom.getTime());
        long diffInHours = diffInMillies / (1000 * 60 * 60);
        return diffInHours * vechile.cost;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public Long ReserveVechile(Vechile vechile,User user){
        Long reservationId = 123L;
       this.vechile = vechile;
       this.user = user;
       this.reservationStatus = ReservationStatus.BOOKED;
       this.vechile.status = VechileStatus.BOOKED;
       return reservationId;
    }

    public Boolean cancelReservation(Long reservationId){
        if(this.reservationId == reservationId){
            this.reservationStatus = ReservationStatus.CANCELLED;
            this.vechile.status = VechileStatus.AVAILABLE;
            return true;
        }
        return false;
    }

}
