package Exam_PracW9;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int studentID;


    public Student(String firstName, String lastName, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }


    @Override
    public String toString() {
        return "Student name: " + firstName.charAt(0) + "." + lastName + ". Student ID: " + studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean equals(Student student){
        System.out.println(this.studentID == student.studentID);
        return this.studentID == student.studentID;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student s1 = new Student("Kent", "Nolan", 20119784);
        Student s2 = new Student("Bob", "Nolan", 2011974);
        System.out.println(s1);
        System.out.println(s2);
        s1.equals(s2);
    }

}


