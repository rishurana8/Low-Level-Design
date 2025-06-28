package org.rishudesign.com.designpatterns.Strategydesignpattern.withstrategypattern;

import org.rishudesign.com.designpatterns.Strategydesignpattern.withstrategypattern.Strategy.DriveStrategy;

public class Vechile {

    DriveStrategy driveStrategy;

    // constructor injection
    Vechile(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
         driveStrategy.drive();
    }
}
