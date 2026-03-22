package org.rishudesign.com.Designs.VendingMachine;

public class Item {
    ItemType itemType;
    int price;

    public void setItemType(ItemType itemType){
        this.itemType = itemType;
    }

        public ItemType getItemType(){
            return this.itemType;
        }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }


}
