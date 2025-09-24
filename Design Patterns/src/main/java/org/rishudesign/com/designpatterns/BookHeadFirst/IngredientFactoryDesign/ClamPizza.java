package org.rishudesign.com.designpatterns.BookHeadFirst.IngredientFactoryDesign;

public class ClamPizza extends Pizza {
    pizzaIngredientFactory ingredientFactory;

    public ClamPizza(pizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();
    }
}

