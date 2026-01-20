package org.rishudesign.com.designpatterns.CodingandConcept.chainresponsibility;

import org.rishudesign.com.Designs.ParkingLot.PaymentStrategy.PaymentStrategy;

public class ErrorLogProcessor extends LogProcessor{

     ErrorLogProcessor(LogProcessor nextProcessor){
         super(nextProcessor);
     }

     public void log(int logLevel,String message){
         if(logLevel == ERROR){
             System.out.println("Error: " + message);
         }else{
             super.log(logLevel,message);
         }
     }
}
