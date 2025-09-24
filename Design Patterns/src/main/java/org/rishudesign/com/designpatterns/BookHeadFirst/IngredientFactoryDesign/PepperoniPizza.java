package org.rishudesign.com.designpatterns.BookHeadFirst.IngredientFactoryDesign;

public class PepperoniPizza extends Pizza {
    pizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(pizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();
    }
}

