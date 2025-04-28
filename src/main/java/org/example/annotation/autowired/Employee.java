package org.example.annotation.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value("3681")
    private int employeeId;

    @Value("Lukesh")
    private String firstname;

    @Value("Gaydhane")
    private String lastname;

    @Value("45000.0")
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }

}
