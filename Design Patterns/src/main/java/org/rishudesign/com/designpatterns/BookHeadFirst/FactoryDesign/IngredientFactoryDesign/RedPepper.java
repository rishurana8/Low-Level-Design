package org.rishudesign.com.designpatterns.BookHeadFirst.FactoryDesign.FactoryDesignPattern.IngredientFactoryDesign;

public class RedPepper implements Veggies {

    @Override
    public Veggies createVeggies() {
        System.out.println("Creating RedPepper Veggies");
        return new RedPepper();
    }
}

