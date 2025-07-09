package org.rishudesign.com.designpatterns.DecoratorDesignPattern.Decorator;

import org.rishudesign.com.designpatterns.DecoratorDesignPattern.Pizza.BasePizza;

public class Mushroom implements ToppingsDecorator{
    BasePizza  basePizza;

    Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost() + 15;
    }
}
