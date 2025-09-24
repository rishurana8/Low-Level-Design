package org.rishudesign.com.designpatterns.BookHeadFirst.IngredientFactoryDesign;

public class Mushroom implements Veggies {

    @Override
    public Veggies createVeggies() {
        System.out.println("Creating Mushroom Veggies");
        return new Mushroom();
    }
}

