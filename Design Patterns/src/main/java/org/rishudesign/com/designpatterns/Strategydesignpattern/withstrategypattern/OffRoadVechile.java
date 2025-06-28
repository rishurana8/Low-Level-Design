package org.rishudesign.com.designpatterns.Strategydesignpattern.withstrategypattern;


import org.rishudesign.com.designpatterns.Strategydesignpattern.withstrategypattern.Strategy.SportsDriveStrategy;

public class OffRoadVechile extends Vechile{

    OffRoadVechile(){
        super(new SportsDriveStrategy());
    }
}

