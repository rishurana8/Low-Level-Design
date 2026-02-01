package org.rishudesign.com.Designs.ZoomCar;
import java.util.*;
import java.util.stream.Collectors;

public class VechileInventory {
    List<Vechile> vechileList;

    VechileInventory(List<Vechile> vechileList){
       this.vechileList = vechileList;
    }

    public void addVechile(Vechile vechile){
        vechileList.add(vechile);
    }

    public void removeVechile(Vechile vechile){
        vechileList.remove(vechile);
    }

    public List<Vechile> getAvailabeVechile(VechileType vechiletype){
        List<Vechile> availableVechiles = new ArrayList<>();

        availableVechiles = vechileList.stream()
                .filter(v -> v.vechileType == vechiletype && v.status == VechileStatus.AVAILABLE)
                .collect(Collectors.toList());

        return availableVechiles;

    }

    public List<Vechile> getAllVechiles(){
        return vechileList;
    }
}
