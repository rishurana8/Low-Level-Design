package org.rishudesign.com.designpatterns.Observabledesignpattern.practiceproblem;

public class Main {
    public static void main(String args[]){
        WeatherStationIObservable weatherStationIObservable = new WeatherStation();
        Observer observer1 = new PhoneDisplay(weatherStationIObservable);
        Observer observer2 = new StasticsDisplay(weatherStationIObservable);

        weatherStationIObservable.add(observer1);
        weatherStationIObservable.add(observer2);

        weatherStationIObservable.setTemperature(45.6);
        weatherStationIObservable.setTemperature(34);
        weatherStationIObservable.setTemperature(21);
        weatherStationIObservable.setTemperature(10);
        weatherStationIObservable.setTemperature(30);
    }
}
