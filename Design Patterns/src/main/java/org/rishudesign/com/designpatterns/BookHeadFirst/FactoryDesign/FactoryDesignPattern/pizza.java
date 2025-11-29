package org.rishudesign.com.designpatterns.BookHeadFirst.FactoryDesign.FactoryDesignPattern;
import java.util.*;

public abstract class pizza {
   String name;
   String dough;
   String sauce;
   ArrayList<String> toppings = new ArrayList<>();

   void prepare(){
       System.out.println("preparing.." + name);

   }

   void bake(){
       System.out.println("Bake at 250 for 30min");
   }

   public String getName(){
       return this.name;
   }



}
