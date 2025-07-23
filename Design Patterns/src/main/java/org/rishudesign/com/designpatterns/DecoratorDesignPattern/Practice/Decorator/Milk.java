package org.rishudesign.com.designpatterns.DecoratorDesignPattern.Practice.Decorator;

import org.rishudesign.com.designpatterns.DecoratorDesignPattern.Practice.Coffee.BaseCoffee;

public class Milk extends CoffeeDecorator{

    public Milk(BaseCoffee coffee){
        super(coffee);
    }

    @Override
    public int cost(){
        return coffee.cost() + 10;
    }
}
