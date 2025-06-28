package org.rishudesign.com.designpatterns.Strategydesignpattern.withstrategypattern;

public class Main {

    public static void main(String args[]) {

        Vechile vechile = new SportsVechile();
        vechile.drive();

        System.out.println("\nAnother Testing\n");

        Vechile vechile2 = new GoodsVechile();
        vechile.drive();
    }
}
