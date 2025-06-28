package org.rishudesign.com.designpatterns.Strategydesignpattern.withstrategypattern;

import org.rishudesign.com.designpatterns.Strategydesignpattern.withstrategypattern.Strategy.NormalDriveStrategy;

public class GoodsVechile extends Vechile{

    GoodsVechile(){
        super(new NormalDriveStrategy());
    }
}
