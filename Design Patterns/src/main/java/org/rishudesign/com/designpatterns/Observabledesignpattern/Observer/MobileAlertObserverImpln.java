package org.rishudesign.com.designpatterns.Observabledesignpattern.Observer;

import org.rishudesign.com.designpatterns.Observabledesignpattern.Observable.StocksObservable;

public class MobileAlertObserverImpln implements NotificationAlertObserver{

    String mobileNo;
    StocksObservable stocksObservable;

    public MobileAlertObserverImpln(String mobileNo,StocksObservable stocksObservable){
        this.mobileNo = mobileNo;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update(){

        sendMessage(mobileNo,"hurry up!");
    }

    private void sendMessage(String mobileNo,String msg){
        System.out.println("message sent to "+ mobileNo);
    }
}
