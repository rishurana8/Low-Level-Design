package org.rishudesign.com.designpatterns.Observabledesignpattern;

import org.rishudesign.com.designpatterns.Observabledesignpattern.Observable.IphoneObservable;
import org.rishudesign.com.designpatterns.Observabledesignpattern.Observable.StocksObservable;
import org.rishudesign.com.designpatterns.Observabledesignpattern.Observer.EmailAlertObserverImpl;
import org.rishudesign.com.designpatterns.Observabledesignpattern.Observer.MobileAlertObserverImpln;
import org.rishudesign.com.designpatterns.Observabledesignpattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String args[]){

        StocksObservable iphoneStock = new IphoneObservable();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xzu@gmail.com",iphoneStock);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpln("12451234532",iphoneStock);

        iphoneStock.add(observer1);
        iphoneStock.add(observer2);

        iphoneStock.setStockCount(10);

    }

}
