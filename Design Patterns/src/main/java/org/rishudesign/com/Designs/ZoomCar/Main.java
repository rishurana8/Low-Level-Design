package org.rishudesign.com.Designs.ZoomCar;
import java.util.*;

public class Main {

  public static void main(String args[]){
      List<User> user = addUsers();
      List<Vechile> vechileList = addVechiles();
      List<Store> stores = addStores(vechileList);


      VechileRentalSystem vechileRentalSystem = new VechileRentalSystem(user,stores);

      Location location = new Location("SomeAddress","CityA","StateA","CountryA","123456");
      Store nearestStore = vechileRentalSystem.findNearestStore(location);

      List<Vechile> availableVechiles = nearestStore.getAvailableVechiles(VechileType.FOUR_WHEELER);

      Reservation reservation = nearestStore.createReservation(availableVechiles.get(0),user.get(0));


      Bill bill  = new Bill(reservation);

      Payment payment = new Payment();

      payment.PayBill(bill);

  }


    public  static List<User> addUsers(){
        List<User> users = new ArrayList<>();
        User user = new User("U1", "Rishu", "ris.gmail.com","9876543210","DL12345");
        users.add(user);
        return users;
    }

    public static List<Store> addStores(List<Vechile> vechiles){
        List<Store>stores = new ArrayList<>();
        Store store = new Store(1L,"Store1",new Location("CityCenter","CityA","StateA","CountryA","123456"));
        store.setVechiles(vechiles);
        stores.add(store);
        return stores;
    }

    public static List<Vechile> addVechiles(){
      List<Vechile> vechileList = new ArrayList<>();
        Vechile vechile1 = new Vechile( 3L,VechileType.FOUR_WHEELER, 2.0,VechileStatus.AVAILABLE);
        vechileList.add(vechile1);
        return vechileList;
    }
}
