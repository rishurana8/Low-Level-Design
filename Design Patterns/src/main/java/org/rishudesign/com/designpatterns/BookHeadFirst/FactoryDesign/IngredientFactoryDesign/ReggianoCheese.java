package org.rishudesign.com.designpatterns.BookHeadFirst.FactoryDesign.FactoryDesignPattern.IngredientFactoryDesign;

public class ReggianoCheese implements Cheese {
    
    @Override
    public Cheese createCheese() {
        System.out.println("Creating Reggiano Cheese");
        return new ReggianoCheese();
    }
}

