package org.rishudesign.com.Designs.ZoomCar;

import java.util.List;

public class VechileRentalSystem {
    List<User> user;
    List<Store> stores;

    VechileRentalSystem(List<User> user, List<Store> stores) {
        this.user = user;
        this.stores = stores;
    }

    public Store findNearestStore(Location userLocation) {
        // Logic to find the nearest store based on userLocation
        return stores.get(0);
    }
}
