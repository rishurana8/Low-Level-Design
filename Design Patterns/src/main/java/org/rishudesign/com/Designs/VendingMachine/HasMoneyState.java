package org.rishudesign.com.Designs.VendingMachine;
import java.util.*;

public class HasMoneyState implements State{

    public HasMoneyState(){
        System.out.println("Vending Machine is in has money state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("Already have money");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception{
        machine.setVendinMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine , Coin coin) throws Exception{
        machine.getCoinList().add(coin);
        System.out.println("Coin inserted");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int productCode) throws Exception {
        throw new Exception("Please click on select product button");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("Please click on select product button");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine , int productCode) throws Exception{
        throw new Exception("Please click on select product button");
    }

    @Override
    public List<Coin> refund(VendingMachine machine) throws Exception{
        List<Coin> coinList = machine.getCoinList();
        machine.setVendingMachineState(new IdleState(machine));
        return coinList;
    }




}
