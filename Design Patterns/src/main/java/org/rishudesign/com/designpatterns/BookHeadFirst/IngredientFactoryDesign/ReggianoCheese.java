package org.rishudesign.com.designpatterns.BookHeadFirst.IngredientFactoryDesign;

public class ReggianoCheese implements Cheese {
    
    @Override
    public Cheese createCheese() {
        System.out.println("Creating Reggiano Cheese");
        return new ReggianoCheese();
    }
}

