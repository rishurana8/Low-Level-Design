package org.rishudesign.com.designpatterns.Observabledesignpattern.practiceproblem;

import java.util.Observable;

public class PhoneDisplay implements Observer{

    private WeatherStationIObservable observable;

    PhoneDisplay(WeatherStationIObservable observable){
        this.observable = observable;
    }

    @Override
    public void update(){
        tempUpdate(observable.getTemperature());
    }

    private void tempUpdate(double temperature){
        System.out.println("Latest temperature is : " + temperature);
    }
}
