package org.rishudesign.com.designpatterns.BookHeadFirst.IngredientFactoryDesign;

public class MarinaraSauce implements Sauce {


    @Override
    public Sauce createSauce(){
        System.out.println("Creating Marinara Sauce");
        return new MarinaraSauce();
    }
}

