package org.rishudesign.com.Designs.ATM.ATMStates;

import org.rishudesign.com.Designs.ATM.ATMRoomComponents.ATM;
import org.rishudesign.com.Designs.ATM.ATMRoomComponents.Card;
import org.rishudesign.com.Designs.ATM.enums.TransactionType;

public class SelectOperation extends ATMState{
    public SelectOperationState(){ showOperations();}

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType txnType){
        switch(txnType){
            case CASH_WITHDRAWAL:
                atm.setCurrentATMState(new CashWithdrawalState());
                break;
            case BALANCE_CHECK:
                atm.setCurrentATMState(new CheckBalanceState());
                break;
            default: {
                System.out.println("Invalid Option");
                exit(atm);
            }
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
        System.out.println("Please collect the Card");
    }

    public void showOperations(){
        System.out.println("Please select the operation");
        TransactionType.showAllTransactionTypes();
    }

}
