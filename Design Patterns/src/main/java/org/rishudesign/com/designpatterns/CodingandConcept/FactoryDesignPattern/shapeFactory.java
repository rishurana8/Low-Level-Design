package org.rishudesign.com.designpatterns.FactoryDesignPattern;

public class shapeFactory {

   public Shape getShape(String input){
        if(input == "circle"){
            return new Circle();
        }
        else if(input == "Rectangle"){
            return new Rectangle();
        }else {
            return null;
        }
    }
}
