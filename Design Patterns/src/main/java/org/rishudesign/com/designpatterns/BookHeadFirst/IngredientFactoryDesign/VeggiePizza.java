package org.rishudesign.com.designpatterns.BookHeadFirst.IngredientFactoryDesign;

public class VeggiePizza extends Pizza {
    pizzaIngredientFactory ingredientFactory;

    public VeggiePizza(pizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}

