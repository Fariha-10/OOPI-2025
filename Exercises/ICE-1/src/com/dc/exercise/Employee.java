//Name:Fariha Noshin
// Date: 2025-01-29
// description:This program implements a simple Employee Payroll System :Allows adding, updating, searching, and displaying employees, and calculates net salary after tax
package com.dc.exercise;
public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private double taxRate;

public Employee(){}
    // Constructor to initialize employee attributes
public Employee(int id, String name, String department, double salary, double taxRate) {
    this.id = id;
    this.name = name;
    this.department = department;
    this.salary = salary;
    this.taxRate = taxRate;
    }
    // Getter methods
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getDepartment() {
        return this.department;
    }
    public double getsalary() {return this.salary;}
    public double getTaxRate(){return this.taxRate;}

    // Setter methods
    public void  setId(int id) {this.id = id;}
    public void  setName(String name) {this.name =name;}
    public void  setDepartment(String department) {this.department = department;}
    public void  setSalary(double salary) {this.salary = salary;}
    public void setTaxRate(double taxRate) {this.taxRate = taxRate;}

    public double calculateNetSalary() {return salary - (salary * taxRate);}
    public void displayEmployee() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Department: " + department);
            System.out.println("Salary: " + salary);
            System.out.println("Tax Rate: " + taxRate);
            System.out.println("Net Salary: " + calculateNetSalary());

    }
}
