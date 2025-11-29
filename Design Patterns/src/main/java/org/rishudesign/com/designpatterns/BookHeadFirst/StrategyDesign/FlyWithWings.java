package org.rishudesign.com.designpatterns.BookHeadFirst.StrategyDesign;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("You are Flying");
    }
}
