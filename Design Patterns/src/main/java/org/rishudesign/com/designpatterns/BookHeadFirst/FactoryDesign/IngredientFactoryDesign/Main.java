package org.rishudesign.com.designpatterns.BookHeadFirst.FactoryDesign.FactoryDesignPattern.IngredientFactoryDesign;

public class Main {
    public static void main(String[] args) {
        pizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ordered: " + pizza.getName());
        System.out.println(pizza);

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ordered: " + pizza.getName());
        System.out.println(pizza);

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ordered: " + pizza.getName());
        System.out.println(pizza);

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ordered: " + pizza.getName());
        System.out.println(pizza);
    }
}

