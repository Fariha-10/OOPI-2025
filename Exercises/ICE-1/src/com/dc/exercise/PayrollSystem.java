package com.dc.exercise;

import java.util.Scanner;

public class PayrollSystem {
    // Maximum number of employees
    private static final int MAX_EMPLOYEES = 100;
    private static final Employee[] employees = new Employee[MAX_EMPLOYEES];
    // Tracks the number of employees
    private static int employeeCount = 0;

    public static void main(String[] args) {
        Scanner inputscanner = new Scanner(System.in);
        int choice;

        while (true) {
            // Display menu
            System.out.println("\nEmployee Payroll System Menu:");
            System.out.println("1. Add a new employee");
            System.out.println("2. View all employees");
            System.out.println("3. Search for an employee by ID");
            System.out.println("4. Update an employee’s salary");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = inputscanner.nextInt();

            switch (choice) {
                case 1:
                    addEmployee(inputscanner);
                    break;
                case 2:
                    viewAllEmployees();
                    break;
                case 3:
                    searchEmployee(inputscanner);
                    break;
                case 4:
                    updateEmployeeSalary(inputscanner);
                    break;
                case 5:
                    System.out.println("Exiting Employee Payroll System...");
                    inputscanner.close();
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }

    // Method to add an employee
    private static void addEmployee(Scanner inputscanner) {
        if (employeeCount >= MAX_EMPLOYEES) {
            System.out.println("Employee list is full. Cannot add more employees.");
            return;
        }
        //validate employee Id
        int id;
        System.out.println("Enter employee ID: ");
        if (inputscanner.hasNextInt()) {
            id = inputscanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter valid ID.");
            inputscanner.next();
            return;
        }

        System.out.println("Enter Name: ");
        String name = inputscanner.nextLine();

        System.out.println("Enter Department: ");
        String department = inputscanner.nextLine();

        // Validate salary input
        double salary;
        System.out.println("Enter Salary: ");
        if (inputscanner.hasNextDouble()) {
            salary = inputscanner.nextDouble();
        } else {
            System.out.println("Invalid input. Please enter a valid number for salary.");
            inputscanner.next();
            return;
        }

        // Validate tax rate
        double taxRate;
        System.out.println("Enter Tax Rate (example: for 13% write 0.13):");
        if (inputscanner.hasNextDouble()) {
            taxRate = inputscanner.nextDouble();
        } else {
            System.out.println("Invalid input. Please enter a valid number for tax rate.");
            inputscanner.next();
            return;
        }

        // Add employee if inputs are valid
        employees[employeeCount] = new Employee(id, name, department, salary, taxRate);
        employeeCount++;
        System.out.println("Employee added successfully!");
    }

    // Method to view all employees
    private static void viewAllEmployees() {
        if (employeeCount == 0) {
            System.out.println("No employees found.");
            return;
        }

        System.out.println("\nEmployee List:");
        for (int i = 0; i < employeeCount; i++) {
            employees[i].displayEmployee();
        }
    }

    // Method to search for an employee by ID
    private static void searchEmployee(Scanner inputscanner) {
        System.out.println("Enter Employee ID to search: ");
        int searchId = inputscanner.nextInt();




        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getId() == searchId) {
                System.out.println("Employee found:");
                employees[i].displayEmployee();
                return;
            }
        }
        System.out.println("Employee with ID " + searchId + " not found.");
    }

    // Method to update an employee’s salary
    private static void updateEmployeeSalary(Scanner inputscanner) {
        System.out.print("Enter Employee ID to update salary: ");
        int updateId = inputscanner.nextInt();




        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getId() == updateId) {
                System.out.println("Enter new salary: ");
                double newSalary = inputscanner.nextDouble();
                employees[i].setSalary(newSalary);
                System.out.println("Salary updated successfully!");
                return;
            }
        }
        System.out.println("Employee with ID " + updateId + " not found.");
    }
}
