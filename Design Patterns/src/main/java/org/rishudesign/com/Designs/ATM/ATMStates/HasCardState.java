package org.rishudesign.com.Designs.ATM.ATMStates;

import org.rishudesign.com.Designs.ATM.ATMRoomComponents.ATM;
import org.rishudesign.com.Designs.ATM.ATMRoomComponents.Card;

public class HasCardState extends ATMState{
    public HasCardState(){
        System.out.println("enter your card pin number");
    }

    @Override
    public void authenticatePin(ATM atm, Card card, int pin){
        boolean isCorrectPinEntered = card.isCorrectPinEntered(pin);
        if(isCorrectPinEntered){
             atm.setCurrentState(new SelectOperationState());
        }else{
            System.out.println("Pin Entered is wrong!");
            exit(atm);
        }
    }

    @Override
    public void exit(ATM atm){
        returnCard();
        atm.setCurrentState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard(){
        System.out.println("Please take out your card");
    }
}
