package org.rishudesign.com.designpatterns.CompositePattern.Problem;

public class File {
    String fileName;

    public File(String fileName){
        this.fileName = fileName;
    }

    public void printContent(){
        System.out.println("printing: " + fileName);
    }
}
