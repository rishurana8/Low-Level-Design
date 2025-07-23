package org.rishudesign.com.designpatterns.DecoratorDesignPattern.Practice.Decorator;

import org.rishudesign.com.designpatterns.DecoratorDesignPattern.Practice.Coffee.BaseCoffee;

public class Cream extends CoffeeDecorator{

    public Cream(BaseCoffee coffee){
        super(coffee);
    }

    @Override
    public  int cost(){
        return coffee.cost() + 45;
    }
}
