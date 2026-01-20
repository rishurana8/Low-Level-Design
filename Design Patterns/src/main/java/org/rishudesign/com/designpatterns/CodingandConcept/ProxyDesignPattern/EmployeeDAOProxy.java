package org.rishudesign.com.designpatterns.CodingandConcept.ProxyDesignPattern;

public class EmployeeDAOProxy implements  EmployeeDAO{
    private EmployeeDAO employeeDAO;

    EmployeeDAOProxy(){
        this.employeeDAO = new EmployeeDAOImpl();
    }

    @Override
    public void create(String client, Employee emp) throws Exception{
        if(client.equalsIgnoreCase("ADMIN")){
            employeeDAO.create(client,emp);
            return;
        }
        throw new Exception("Unauthorized Access");
    }

    @Override
    public void delete(String client,int employeeId) throws Exception{
        if(client.equalsIgnoreCase("ADMIN")){
            employeeDAO.delete(client,employeeId);
            return;
        }
        throw new Exception("Unauthorized Access");
    }

    @Override
    public Employee get(String client , int employeeId) throws Exception{
        if (client.equalsIgnoreCase("ADMIN") || client.equalsIgnoreCase("USER")){
            return employeeDAO.get(client,employeeId);
        }
        throw new Exception("Unauthorized Access");
    }
}
