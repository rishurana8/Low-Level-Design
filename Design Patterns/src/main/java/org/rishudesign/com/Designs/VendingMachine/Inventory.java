package org.rishudesign.com.Designs.VendingMachine;

public class Inventory {
    ItemShelf[] inventory;

    Inventory(int itemCount){
         inventory = new ItemShelf[itemCount];
         initialEmptyInventory();
    }

    public void initialEmptyInventory(){
        int startCode= 101;
        for(int i=0;i<inventory.length;i++){
            ItemShelf space = new ItemShelf();
            space.setCode(startCode);
            space.setSoldout(true);
            inventory[i] = space;
            startCode++;
        }
    }

    public void addItem(Item item, int productCode) throws Exception{
        for(ItemShelf space : inventory){
            if(space.getCode() == productCode){
                if(space.isSoldout()){
                    space.setItem(item);
                    space.setSoldout(false);
                }else{
                    throw new Exception("Item already exists");
                }
            }
        }
    }


}
