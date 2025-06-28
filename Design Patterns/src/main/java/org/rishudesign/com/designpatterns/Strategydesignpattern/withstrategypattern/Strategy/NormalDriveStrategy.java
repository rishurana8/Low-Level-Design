package org.rishudesign.com.designpatterns.Strategydesignpattern.withstrategypattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{


    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
