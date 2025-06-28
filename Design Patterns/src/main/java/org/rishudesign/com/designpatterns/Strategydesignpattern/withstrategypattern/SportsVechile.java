package org.rishudesign.com.designpatterns.Strategydesignpattern.withstrategypattern;

import org.rishudesign.com.designpatterns.Strategydesignpattern.withstrategypattern.Strategy.SportsDriveStrategy;

public class SportsVechile extends Vechile{

    SportsVechile(){
        super(new SportsDriveStrategy());
    }
}
