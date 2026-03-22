package org.rishudesign.com.Designs.VendingMachine;
import java.util.*;

public interface State {
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception;
    public void chooseProduct(VendingMachine vendingMachine, int productCode) throws Exception;
    public int getChange(int returnChangeMoney) throws Exception;
    public Item dispenseProduct(VendingMachine vendingMachine,int productCode) throws Exception;
    public List<Coin> refund(VendingMachine vendingMachine) throws Exception;
//    public void updateInventory(VendingMachine vendinMachine , Item item , int productCode) throws Exception;
}
