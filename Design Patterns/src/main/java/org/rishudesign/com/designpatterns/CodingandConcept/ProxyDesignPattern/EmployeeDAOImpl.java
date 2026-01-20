package org.rishudesign.com.designpatterns.CodingandConcept.ProxyDesignPattern;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public void create(String client, Employee emp) throws Exception {
        System.out.println("Creating employee for client: " + client);
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleting employee with ID " + employeeId + " for client: " + client);
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        System.out.println("Getting employee with ID " + employeeId + " for client: " + client);
        return new Employee();
    }

}
