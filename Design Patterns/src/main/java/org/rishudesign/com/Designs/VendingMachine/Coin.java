package org.rishudesign.com.Designs.VendingMachine;

public enum Coin {
    PENNY(1),
   NICKEL(10),
    QUARTER(25);


    public int value;
    Coin(int value){
        this.value = value;
    }
}
