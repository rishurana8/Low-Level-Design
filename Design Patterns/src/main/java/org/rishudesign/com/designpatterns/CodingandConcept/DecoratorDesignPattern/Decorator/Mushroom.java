package org.rishudesign.com.designpatterns.CodingandConcept.DecoratorDesignPattern.Decorator;

import org.rishudesign.com.designpatterns.CodingandConcept.DecoratorDesignPattern.Pizza.BasePizza;

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
