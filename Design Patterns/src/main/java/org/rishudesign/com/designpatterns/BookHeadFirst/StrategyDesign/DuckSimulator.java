package org.rishudesign.com.designpatterns.BookHeadFirst.StrategyDesign;

public class DuckSimulator {
    public static void main(String args[]){
        Duck mullard = new MullarDuck();

        mullard.performFly();
        mullard.performQuack();

        mullard.setFlyBehavior(new FlyWithNoWings());
        mullard.setQuackBehavior(new NoQuack());

        mullard.performFly();
        mullard.performQuack();
    }
}
