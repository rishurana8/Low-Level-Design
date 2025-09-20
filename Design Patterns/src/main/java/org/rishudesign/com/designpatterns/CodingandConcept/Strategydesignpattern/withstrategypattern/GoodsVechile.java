package org.rishudesign.com.designpatterns.CodingandConcept.Strategydesignpattern.withstrategypattern;

import org.rishudesign.com.designpatterns.CodingandConcept.Strategydesignpattern.withstrategypattern.Strategy.NormalDriveStrategy;

public class GoodsVechile extends Vechile{

    GoodsVechile(){
        super(new NormalDriveStrategy());
    }
}
