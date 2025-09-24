package org.rishudesign.com.designpatterns.BookHeadFirst.IngredientFactoryDesign;

public class SlicedPepperoni implements Pepperoni {

    @Override
    public Pepperoni createPepperoni() {
        System.out.println("Creating Sliced Pepperoni");
        return new SlicedPepperoni();
    }
}

