package org.rishudesign.com.designpatterns.Observabledesignpattern.practiceproblem;
import java.util.*;

public class WeatherStation implements WeatherStationIObservable {

    List<Observer>observerList = new ArrayList<>();
    private double temperature;

    @Override
    public void add(Observer observer){
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer){
        observerList.remove(observer);
    }

    @Override
    public void Notify(){
        for(Observer observer: observerList){
            observer.update();
        }
    }

    @Override
    public void setTemperature(double temperature){
        this.temperature = temperature;
        Notify();
    }


    @Override
    public double getTemperature(){
        return this.temperature;
    }

}
