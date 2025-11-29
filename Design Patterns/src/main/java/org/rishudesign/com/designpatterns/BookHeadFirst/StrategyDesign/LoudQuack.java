package org.rishudesign.com.designpatterns.BookHeadFirst.StrategyDesign;

public class LoudQuack implements  QuackBehavior{
    @Override
    public void quack(){
        System.out.println("You're quack is very  Loud!!");
    }
}
