package org.rishudesign.com.designpatterns.CodingandConcept.ProxyDesignPattern;

public class Main {
    public static void main(String[] args){
        try{
            EmployeeDAO employeeDAO = new EmployeeDAOProxy();
            employeeDAO.create("USER",new Employee());
            System.out.println("Employee created successfully");
        }catch(Exception e){
            System.out.println(e.getMessage());

        }
    }
}
