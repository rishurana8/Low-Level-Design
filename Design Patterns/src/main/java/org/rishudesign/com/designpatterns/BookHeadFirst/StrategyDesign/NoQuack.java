package org.rishudesign.com.designpatterns.BookHeadFirst.StrategyDesign;

public class NoQuack implements  QuackBehavior{

    @Override
    public void quack(){
        System.out.println("Sorry! , You can't quack ");
    }
}
