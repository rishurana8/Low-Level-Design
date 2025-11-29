package org.rishudesign.com.designpatterns.BookHeadFirst.FactoryDesign.FactoryDesignPattern.IngredientFactoryDesign;

public class Garlic implements Veggies {

    @Override
    public Veggies createVeggies() {
        System.out.println("Creating Garlic Veggies");
        return new Garlic();
    }
}

