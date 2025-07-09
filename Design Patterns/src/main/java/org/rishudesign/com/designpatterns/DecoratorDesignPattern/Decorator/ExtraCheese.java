package org.rishudesign.com.designpatterns.DecoratorDesignPattern.Decorator;

import org.rishudesign.com.designpatterns.DecoratorDesignPattern.Pizza.BasePizza;

public class ExtraCheese implements ToppingsDecorator{

    BasePizza basePizza;

    public ExtraCheese (BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost() + 10;
    }
}
