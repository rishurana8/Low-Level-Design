package org.rishudesign.com.designpatterns.BookHeadFirst.FactoryDesign.FactoryDesignPattern.IngredientFactoryDesign;

public class ThinCrustDough implements Dough {

    @Override
    public Dough createDough(){
        System.out.println("Creating Thin Crust Dough");
        return new ThinCrustDough();
    }
}

