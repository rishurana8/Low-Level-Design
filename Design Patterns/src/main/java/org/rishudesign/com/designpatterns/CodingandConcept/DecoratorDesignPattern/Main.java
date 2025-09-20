package org.rishudesign.com.designpatterns.CodingandConcept.DecoratorDesignPattern;

import org.rishudesign.com.designpatterns.CodingandConcept.DecoratorDesignPattern.Decorator.ExtraCheese;
import org.rishudesign.com.designpatterns.CodingandConcept.DecoratorDesignPattern.Pizza.BasePizza;
import org.rishudesign.com.designpatterns.CodingandConcept.DecoratorDesignPattern.Pizza.FarmHouse;

public class Main {
    public static void main(String args[]){
        BasePizza farmHousePizza = new FarmHouse();
        BasePizza finalPizza = new ExtraCheese(farmHousePizza);
        System.out.println("cost of final pizza after adding cheese on farmhouse " + finalPizza.cost());
    }
}
