package org.rishudesign.com.Designs.VendingMachine;
import java.util.*;

public class SelectionState implements State{
    public SelectionState(){
        System.out.println("VendingMachine is in Selection State");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception{
        throw new Exception("Already have money");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception{
        throw new Exception("Already have money");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception{
        return;
    }

    @Override
    public void chooseProduct(VendingMachine machine, int productCode) throws Exception{
        // get Product from machine
        Item item = machine.getProduct(productCode);

        // Total Amount paid by User
        int paidByUser = 0;
        for(Coin coin: machine.getCoinList()){
            paidByUser += coin.value;
        }

        if(paidByUser<item.getPrice()){
            System.out.println("Insufficient amount ");
            refund(machine);
            throw new Exception("Insufficient amount");
        }

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception{
        System.out.println("Returned chagne in tray : " + returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public List<Coin> refund(VendingMachine machine) throws Exception{
        System.out.println("Refunding money");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    @Override
    public Item dispenseProduct(VendingMachine machine ,int productCode) throws Exception{
        throw new Exception("Product cannot be dispensed at selection State");
    }




}
