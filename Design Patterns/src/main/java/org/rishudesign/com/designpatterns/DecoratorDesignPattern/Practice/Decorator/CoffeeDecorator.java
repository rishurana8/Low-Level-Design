package org.rishudesign.com.designpatterns.DecoratorDesignPattern.Practice.Decorator;

import org.rishudesign.com.designpatterns.DecoratorDesignPattern.Practice.Coffee.BaseCoffee;

public abstract class CoffeeDecorator implements BaseCoffee{
    protected BaseCoffee coffee;

    CoffeeDecorator(BaseCoffee coffee){
        this.coffee = coffee;
    }

    public abstract int cost();
}
