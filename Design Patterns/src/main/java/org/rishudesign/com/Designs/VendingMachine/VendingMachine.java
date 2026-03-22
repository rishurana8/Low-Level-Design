package org.rishudesign.com.Designs.VendingMachine;
import java.util.*;

public class VendingMachine {
    private State vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine(){
        vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }

    public void  setVendingMachineState(State state){
        this.vendingMachineState = state;
    }

    public State getVendingMachineState(State state){
        return this.vendingMachineState;
    }


    public void setInventory(Inventory inventory){
        this.inventory = inventory;
    }

    public Inventory getInventory(){
        return this.inventory;
    }

    public void setCoinList(List<Coin> coinlist){
        this.coinList = coinlist;
    }

    public List<Coin> getCoinList(){
        return this.coinList;
    }


}
