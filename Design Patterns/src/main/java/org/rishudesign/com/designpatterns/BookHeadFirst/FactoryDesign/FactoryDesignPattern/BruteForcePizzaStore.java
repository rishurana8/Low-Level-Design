package org.rishudesign.com.designpatterns.BookHeadFirst.FactoryDesign.FactoryDesignPattern;

public class BruteForcePizzaStore {
    public pizza createPizza(String type,String style){
        pizza pizza  = null;
        if("newyork".equalsIgnoreCase(style)){     // we can move this part of code in a factory
            if("cheese".equalsIgnoreCase(type)){
                pizza = new NYStylePizza();
            }
        }else if("chicago".equalsIgnoreCase(style)){
            if("cheese".equalsIgnoreCase(type)){
                pizza = new chicagoStylePizza();
            }
        }
        pizza.prepare();
        pizza.bake();

        return pizza;
    }
}
