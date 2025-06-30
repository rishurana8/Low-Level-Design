package org.rishudesign.com.designpatterns.Observabledesignpattern.Observer;

import org.rishudesign.com.designpatterns.Observabledesignpattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StocksObservable stocksObservable;

    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable){
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update(){
        sendEmail(emailId,"Product in stock");
    }


    private void sendEmail(String emailId,String msg){
        System.out.println("mail sent to :" + emailId);
    }
}
