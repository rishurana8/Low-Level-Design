package org.rishudesign.com.designpatterns.BookHeadFirst.IngredientFactoryDesign;

public interface pizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
