package org.rishudesign.com.designpatterns.BookHeadFirst.FactoryDesignPattern;

public class NYFactory implements PizzaFactory{
    @Override
    public pizza createPizza(String type) {
        if ("cheese".equalsIgnoreCase(type)) {
            return new NYStylePizza();
        }
        return null;
    }
}
