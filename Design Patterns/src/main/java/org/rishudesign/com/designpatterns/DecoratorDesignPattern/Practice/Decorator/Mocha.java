package org.rishudesign.com.designpatterns.DecoratorDesignPattern.Practice.Decorator;

import org.rishudesign.com.designpatterns.DecoratorDesignPattern.Practice.Coffee.BaseCoffee;

public class Mocha extends CoffeeDecorator{

    Mocha(BaseCoffee coffee){
        super(coffee);
    }

    @Override
    public int cost(){
        return coffee.cost() + 35;
    }
}
