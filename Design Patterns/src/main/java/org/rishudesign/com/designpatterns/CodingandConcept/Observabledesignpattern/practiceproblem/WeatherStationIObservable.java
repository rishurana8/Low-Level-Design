package org.rishudesign.com.designpatterns.CodingandConcept.Observabledesignpattern.practiceproblem;

public interface WeatherStationIObservable {

    public void add(Observer observer);

    public void remove(Observer observer);

    public void Notify();

    public void setTemperature(double temp);

    public double getTemperature();

}
