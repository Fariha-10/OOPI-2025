package com.dc.assignment;

public class StudentDetail {
        public static void main(String[] args) {
            // Task 1: Creating two Student objects
            Student student1 = new Student("Anika", 21, "100988145");
            Student student2 = new Student("Bani", 22, "100988134");

            // Display initial details
            System.out.println("Before updating: ");
            student1.displayDetails();
            student2.displayDetails();

            // Task 2: Modify student2 details using setters
            student2.setName("Fariha");
            student2.setAge(20);
            student2.setStudentID("100988168");

            // Display updated details
            System.out.println("After updating student2 information: ");
            student2.displayDetails();

            // Task 3: Changing university name
            Student.changeUniversityName(" Toronto Metropolitan University");

            // Verify the change reflects for all students
            System.out.println("After updating university name: ");
            student1.displayDetails();
            student2.displayDetails();
        }
    }


