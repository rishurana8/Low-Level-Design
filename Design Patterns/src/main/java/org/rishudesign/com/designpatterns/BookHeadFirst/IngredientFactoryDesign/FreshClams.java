package org.rishudesign.com.designpatterns.BookHeadFirst.IngredientFactoryDesign;

public class FreshClams implements Clams {

    @Override
    public Clams createClams() {
        System.out.println("Fresh Clams from Long Island Sound");
        return new FreshClams();
    }
}

