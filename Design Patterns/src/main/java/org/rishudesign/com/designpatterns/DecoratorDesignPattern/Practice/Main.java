package org.rishudesign.com.designpatterns.DecoratorDesignPattern.Practice;

import org.rishudesign.com.designpatterns.DecoratorDesignPattern.Practice.Coffee.BaseCoffee;
import org.rishudesign.com.designpatterns.DecoratorDesignPattern.Practice.Coffee.Latte;
import org.rishudesign.com.designpatterns.DecoratorDesignPattern.Practice.Decorator.Cream;
import org.rishudesign.com.designpatterns.DecoratorDesignPattern.Practice.Decorator.Milk;

public class Main {
    public static void main(String args[]){
        BaseCoffee coffee = new Latte();
        BaseCoffee modifiedCoffee = new Milk(new Cream(coffee));

        System.out.println("cost of the modified coffee is : " + modifiedCoffee.cost());
    }
}
