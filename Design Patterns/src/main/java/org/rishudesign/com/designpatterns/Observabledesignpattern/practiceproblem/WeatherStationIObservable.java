package org.rishudesign.com.designpatterns.Observabledesignpattern.practiceproblem;

public interface WeatherStationIObservable {

    public void add(Observer observer);

    public void remove(Observer observer);

    public void Notify();

    public void setTemperature(double temp);

    public double getTemperature();

}
