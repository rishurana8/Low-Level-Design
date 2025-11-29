package org.rishudesign.com.designpatterns.BookHeadFirst.StrategyDesign;

public class MullarDuck extends Duck{
    public MullarDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new LoudQuack();
    }

    @Override
    public void display() {
        System.out.println("I am a beautiful Mallard Duck 🦆");
    }
}
