package org.rishudesign.com.designpatterns.BookHeadFirst.FactoryDesign.FactoryDesignPattern.IngredientFactoryDesign;

public class Onion implements Veggies {
    @Override
    public  Veggies createVeggies() {
        System.out.println("Creating Onion Veggies");
        return new Onion();
    }
}

