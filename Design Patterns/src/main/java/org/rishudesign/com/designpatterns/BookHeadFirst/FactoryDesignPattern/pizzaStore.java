package org.rishudesign.com.designpatterns.BookHeadFirst.FactoryDesignPattern;

public class pizzaStore {
    PizzaFactory pizzaFactory;

    public pizzaStore(PizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    public pizza orderPizza(String type){
        pizza pizza = pizzaFactory.createPizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
        } else {
            System.out.println("Sorry, this type is not available.");
        }
        return pizza;
    }
}
