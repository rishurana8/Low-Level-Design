package org.rishudesign.com.designpatterns.BookHeadFirst.StrategyDesign;

public class FlyWithNoWings implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("You have No wings you cannnot fly");
    }
}
