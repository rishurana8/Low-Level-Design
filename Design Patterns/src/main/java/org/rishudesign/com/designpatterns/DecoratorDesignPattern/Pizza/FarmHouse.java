package org.rishudesign.com.designpatterns.DecoratorDesignPattern.Pizza;

public class FarmHouse implements BasePizza{
    @Override
    public int cost() {
        return 200;
    }
}
