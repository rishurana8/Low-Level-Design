package org.rishudesign.com.Designs.ZoomCar;

public class Bill {
    Reservation reservation;
    double totalBillAmount;
    boolean isPaid;

    Bill(Reservation reservation){
        this.reservation = reservation;
        this.totalBillAmount = calculateAmount();
        this.isPaid = false;
    }

    public Double calculateAmount(){
        return 100.00;
    }
}
