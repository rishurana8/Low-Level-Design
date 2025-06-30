package org.rishudesign.com.designpatterns.Observabledesignpattern.Observable;

import org.rishudesign.com.designpatterns.Observabledesignpattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    // So here example amazon mai kafi saare stocks hai like iphone laptop mixer etc.
    // toh yeh us stocks ka interface hai and uska implementation hoga abhi

    public void add(NotificationAlertObserver notificationAlertObserver);


    // remove ka kaam aise ho skta hai ki koi observer ab us obseravalb ko na dekhna chahta ho
    // like for example mai rishu ab phone ko ni dekhna chaht toh ab remove bhi krna pdega na
    // ki konsa observer tha pr himanshu dekhna chahta hai toh isliye observer remove k case mai inject krna jaroori hai
    public void remove(NotificationAlertObserver notificationAlertObserver);

    public void notifySubscribers();

    public void setStockCount(int newStockAdded);

    public int getStockCount();

}
