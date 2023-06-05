package Exam_PracW2;

import java.util.Scanner;

public class Student {

    String firstName;
    String lastName;
    String studentID;

    public Student(String firstName, String lastName, String studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = "?";
    }

    @Override
    public String toString() {
        return "Student{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", studentID='" + studentID + '\'' + '}';
    }

    public Student() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.studentID = "?";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter student's first name:");
        String userFirstName = input.nextLine();
        System.out.println("Please enter student's last name:");
        String userLastName = input.nextLine();
        System.out.println("Please enter student's ID:");
        String userID = input.nextLine();
        System.out.println("Calling 3 parameter constructor:\n");
        Student s1 = new Student(userFirstName, userLastName, userID);
        System.out.println(s1);
        System.out.println("Calling 2 parameter constructor:\n");
        Student s2 = new Student(userFirstName, userLastName);
        System.out.println(s2);
        System.out.println("Calling zero parameter constructor:\n");
        Student s3 = new Student();
        System.out.println(s3);
    }
}
