package org.rishudesign.com.designpatterns.BookHeadFirst.FactoryDesignPattern;

public class Main {
    public static void main(String args[]){
        PizzaFactory NYPizzaFactory = new NYFactory();
        pizzaStore pizzaStore = new pizzaStore(NYPizzaFactory);
        pizzaStore.orderPizza("cheese");

        PizzaFactory ChicagoFactory = new chicagoFactory();
        pizzaStore chicagopizzastore = new pizzaStore(ChicagoFactory);
        chicagopizzastore.orderPizza("cheese");


    }
}
