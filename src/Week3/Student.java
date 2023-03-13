package Week3;

import java.util.Scanner;

public class Student {
    String firstname;
    String lastname;
    String ID;
    public Student(String firstname, String lastname, String ID) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ID = ID;
    }
    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ID = "?";
    }
    public Student() {
        this.firstname = "UNKNOWN";
        this.lastname = "UNKNOWN";
        this.ID = "?";
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter student's first name: ");
        String firstname = input.nextLine();
        System.out.println("Please enter student's last name: ");
        String lastname = input.nextLine();
        System.out.println("Please enter student's ID: ");
        String ID = input.nextLine();

        Student s1 = new Student(firstname, lastname, ID);
        Student s2 = new Student(firstname, lastname);
        Student s3 = new Student();
        System.out.println("Calling 3 parameter:");
        System.out.println("First name:" + " " + s1.firstname + " | " + "Last name:" + s1.lastname + " | " + "Student Id:" + " " +s1.ID );
        System.out.println("Calling 2 parameter");
        System.out.println("First name:" + " " + s2.firstname + " | " + "Last name: " + s2.lastname + " | " + " Student Id:" + s2.ID);
        System.out.println("Calling zero parameter");
        System.out.println("First name:" + " " + s3.firstname + " | " +" Last name:" + s3.lastname + " | " +" Student Id:" + s3.ID);
    }
}