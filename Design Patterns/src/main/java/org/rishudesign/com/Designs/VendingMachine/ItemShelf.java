package org.rishudesign.com.Designs.VendingMachine;

public class ItemShelf {
    Item item;
    int code;
    boolean soldout;

    public void setItem(Item item){
        this.item = item;
    }

    public Item getItem(){
        return this.item;
    }

        public void setCode(int code) {
            this.code = code;
        }

        public int getCode() {
            return this.code;
        }

        public void setSoldout(boolean soldout) {
            this.soldout = soldout;
        }

        public boolean isSoldout() {
            return this.soldout;
        }


}
