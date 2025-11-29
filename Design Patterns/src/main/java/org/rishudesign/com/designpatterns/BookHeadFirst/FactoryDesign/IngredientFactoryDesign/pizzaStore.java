package org.rishudesign.com.designpatterns.BookHeadFirst.FactoryDesign.FactoryDesignPattern.IngredientFactoryDesign;

import java.util.Optional;

public abstract class pizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type)
            .orElseThrow(() -> new IllegalArgumentException("Error: Unknown pizza type '" + type + "'"));
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    protected abstract Optional<Pizza> createPizza(String type);
}
