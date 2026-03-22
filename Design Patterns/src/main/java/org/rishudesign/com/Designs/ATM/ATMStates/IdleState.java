package org.rishudesign.com.Designs.ATM.ATMStates;

import org.rishudesign.com.Designs.ATM.ATMRoomComponents.ATM;
import org.rishudesign.com.Designs.ATM.ATMRoomComponents.Card;

public class IdleState extends ATMState{
    @Override
    public void insertCard(ATM atm, Card card){
        System.out.println("Card is inserted");
        atm.setCurrentState(new HasCardState());
    }
}
