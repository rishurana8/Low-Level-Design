package org.rishudesign.com.designpatterns.Strategydesignpattern.withstrategypattern.Strategy;

public class SportsDriveStrategy implements DriveStrategy{

    @Override
    public void drive(){
        System.out.println("Sports drive capability");
    }
}
