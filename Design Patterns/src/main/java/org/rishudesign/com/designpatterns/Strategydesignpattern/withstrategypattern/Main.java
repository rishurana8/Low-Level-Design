package org.rishudesign.com.designpatterns.Strategydesignpattern.withstrategypattern;

import org.rishudesign.com.designpatterns.Strategydesignpattern.withstrategypattern.Strategy.NormalDriveStrategy;

public class Main {

    public static void main(String args[]) {

        Vechile vechile = new OffRoadVechile();
        vechile.drive();

        System.out.println("\n");

        Vechile vechile2 = new GoodsVechile();
        vechile2.drive();

        System.out.println("\n");
        // here we are creating object of normal vechile and here we have to manually pass in constructor drive strategy
        // As here we are not creating any object of sportsvechile goodsvechile direclty
        Vechile vechile3 = new Vechile(new NormalDriveStrategy());
        vechile3.drive();
    }
}
