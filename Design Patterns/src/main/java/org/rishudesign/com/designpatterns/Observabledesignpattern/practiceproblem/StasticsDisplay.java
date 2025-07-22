package org.rishudesign.com.designpatterns.Observabledesignpattern.practiceproblem;

import java.util.ArrayList;
import java.util.List;

public class StasticsDisplay implements Observer{
    List<Double> prevdata = new ArrayList<>();

    WeatherStationIObservable observable;

    StasticsDisplay(WeatherStationIObservable observable){
        this.observable = observable;
    }


    @Override
    public void update(){
        prevdata.add(observable.getTemperature());
        if(prevdata.size()==5){
             getAverage();
        }
    }

    public void getAverage(){
        double sum = 0;
        double avg = 0;
        for(double ele: prevdata){
            sum+=ele;
        }
        avg = sum/5;
        prevdata.clear();
        System.out.println("Average of last 5 temp value is : " + avg);
    }
}
