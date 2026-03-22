package org.rishudesign.com.Designs.VendingMachine;
import java.util.*;

public class IdleState implements State{
    public  IdleState(){
        System.out.println("Vending Machine is in Idle State");
    }

    public IdleState(VendingMachine vendingMachine){
        System.out.print("Vending Machine is in idle state");
        vendingMachine.setCoinList(new ArrayList<>());
    }


    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Please click on insert coin button");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception {
        throw new Exception("Please insert coin first");
    }

    @Override
    public void chooseProduct(VendingMachine machine,int productCode) throws Exception{
        throw new Exception("Please insert coin first");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("No money inserted");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine,int productCode) throws Exception {
        throw new Exception("Please insert coin first");
    }

    @Override
    public List<Coin> refund(VendingMachine machine) throws Exception {
        throw new Exception("No money inserted");
    }




}
