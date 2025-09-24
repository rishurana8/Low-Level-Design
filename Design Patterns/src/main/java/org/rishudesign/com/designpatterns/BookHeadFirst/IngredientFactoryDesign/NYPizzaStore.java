package org.rishudesign.com.designpatterns.BookHeadFirst.IngredientFactoryDesign;

import java.util.Optional;

public class NYPizzaStore extends pizzaStore{
    @Override
    protected Optional<Pizza> createPizza(String type) {
        Pizza pizza = null;
        pizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equalsIgnoreCase(type)) {
            pizza = new cheesePizza(ingredientFactory);
            pizza.setName("NY Style Cheese Pizza");
        } else if ("veggie".equalsIgnoreCase(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NY Style Veggie Pizza");
        } else if ("clam".equalsIgnoreCase(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NY Style Clam Pizza");
        } else if ("pepperoni".equalsIgnoreCase(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("NY Style Pepperoni Pizza");
        }
        return Optional.ofNullable(pizza);
    }
}
