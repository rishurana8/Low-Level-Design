package org.rishudesign.com.designpatterns.CodingandConcept.Strategydesignpattern.withstrategypattern;


import org.rishudesign.com.designpatterns.CodingandConcept.Strategydesignpattern.withstrategypattern.Strategy.SportsDriveStrategy;

public class OffRoadVechile extends Vechile{

    OffRoadVechile(){
        super(new SportsDriveStrategy());
    }
}

