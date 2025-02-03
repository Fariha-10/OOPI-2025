package com.dc.assignment;

//Define the Student class
public class Student {
    private String name;
    private int age;
    private String studentID;

    private static String universityName = "Tech University";

    // Default constructor
    public Student() {}

    // Constructor to initialize all fields
    public Student(String name, int age, String studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentID() {
        return studentID;
    }

    public static String getUniversityName() {
        return universityName;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // method to change university name
    public static void changeUniversityName(String newName) {
        universityName = newName;
    }


    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + getStudentID());
        System.out.println("University: " + getUniversityName());
        System.out.println();
    }
}

