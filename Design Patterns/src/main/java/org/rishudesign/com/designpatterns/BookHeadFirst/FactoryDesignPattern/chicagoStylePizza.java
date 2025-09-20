package org.rishudesign.com.designpatterns.BookHeadFirst.FactoryDesignPattern;

public class chicagoStylePizza extends pizza{
    public chicagoStylePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut(){
        System.out.println("Cutting in square slices");
    }
}
