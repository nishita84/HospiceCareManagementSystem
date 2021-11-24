/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author architnigam
 */
public class Employee {
    
    private String employeeName;
    private int employeeID;
    private static int count = 1;

    public Employee() {
        employeeID = count;
        count++;
    }

    

    @Override
    public String toString() {
        return employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    
}
