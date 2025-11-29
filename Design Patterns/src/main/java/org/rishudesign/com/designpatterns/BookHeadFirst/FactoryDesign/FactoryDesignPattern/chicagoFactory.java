package org.rishudesign.com.designpatterns.BookHeadFirst.FactoryDesign.FactoryDesignPattern;

public class chicagoFactory implements PizzaFactory{
    @Override
    public pizza createPizza(String type) {
        if ("cheese".equalsIgnoreCase(type)) {
            return new chicagoStylePizza();
        }
        return null;
    }
}
