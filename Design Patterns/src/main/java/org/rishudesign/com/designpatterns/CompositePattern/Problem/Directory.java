package org.rishudesign.com.designpatterns.CompositePattern.Problem;
import java.util.*;

public class Directory {
    String directoryName;
    List<Object> objectList;

    public Directory(String directoryName){
        this.directoryName = directoryName;
        this.objectList = objectList;
    }

    public void add(Object object){
        objectList.add(object);
    }

    public void remove(Object object){
        objectList.remove(object);
    }

    public void printContent(){
        System.out.println("Directory Name: " + directoryName);
        for(Object obj: objectList){
            if(obj instanceof File){
                ((File) obj).printContent();
            }else if(obj instanceof Directory){
                ((Directory) obj).printContent();
            }
        }
    }
}
