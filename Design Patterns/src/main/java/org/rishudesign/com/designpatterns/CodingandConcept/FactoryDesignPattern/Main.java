package org.rishudesign.com.designpatterns.FactoryDesignPattern;

public class Main {

    public static void main(String args[]) {
        shapeFactory shapeFactory = new shapeFactory();
        Shape shapeobj = shapeFactory.getShape("circle");
        shapeobj.draw();
    }
}
