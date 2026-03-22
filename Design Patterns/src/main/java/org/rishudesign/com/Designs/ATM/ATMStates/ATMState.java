package org.rishudesign.com.Designs.ATM.ATMStates;

import org.rishudesign.com.Designs.ATM.ATMRoomComponents.ATM;
import org.rishudesign.com.Designs.ATM.ATMRoomComponents.Card;
import org.rishudesign.com.Designs.ATM.enums.TransactionType;

public abstract class ATMState {
    public void insertCard(ATM atm, Card card) {System.out.println("Something went Wrong!");}
    public void authenticatePin(ATM atm, Card card, int pin) {System.out.println("Something went Wrong!");}
    public void selectOperation(ATM atm, Card card, TransactionType txnType) {
        System.out.println("Something went Wrong!");
    }

    public void cashWithdrawal(ATM atm, Card card,int withDrawalAmount){
        System.out.println("Something went Wrong!");
    }
    public void displayBalance(ATM atm,Card card){  System.out.println("Something went Wrong!");}
    public void returnCard(){System.out.println("Something went Wrong!");}
    public void exit(ATM atm){
        System.out.println("Something went Wrong!");
    }
}
