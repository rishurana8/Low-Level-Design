package org.rishudesign.com.Designs.VendingMachine;

import java.util.List;

public class DispenseState implements State{

    DispenseState(VendingMachine machine, int codeNumber) throws Exception{
        System.out.println("Currently Vending machine is in DispenseState");
        dispenseProduct(machine, codeNumber);
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception{
        System.out.println("Product has been dispensed");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }


    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("Product is being dispensed");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Product is being dispensed");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception {
        throw new Exception("Product is being dispensed");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int productCode) throws Exception {
        throw new Exception("Product is being dispensed");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("Product is being dispensed");
    }

    @Override
    public List<Coin> refund(VendingMachine machine) throws Exception {
        throw new Exception("Product is being dispensed");
    }


}
