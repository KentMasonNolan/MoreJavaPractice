package Exam_PracW9;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMarks implements Comparable<StudentMarks>{

    private String name;

    private ArrayList<Double> marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Double> marks) {
        this.marks = marks;
    }

    public StudentMarks(String name) {
        this.name = name;
        marks = new ArrayList<>();
    }

    public void add(Double mark){
        this.marks.add(mark);
    }

    @Override
    public String toString() {
        String output = "";
        output += this.name + " Has the following marks: ";
        for (Double marks: this.marks){
            output += (marks + " ");
        }
        return output;
    }

    public Double average() {
        double sum = 0;
        for (Double mark : marks) {
            sum += mark;
        }
        return sum / marks.size();
    }

    @Override
    public int compareTo(StudentMarks o) {
        return average().compareTo(o.average());
    }

    public static void main(String[] args) {
        ArrayList<StudentMarks> students = new ArrayList<>();

        StudentMarks student1 = new StudentMarks("John");
        student1.add(75.5);
        student1.add(82.0);
        student1.add(90.5);
        students.add(student1);

        StudentMarks student2 = new StudentMarks("Jane");
        student2.add(85.0);
        student2.add(78.5);
        student2.add(92.0);
        students.add(student2);

        StudentMarks student3 = new StudentMarks("Bob");
        student3.add(90.0);
        student3.add(88.5);
        student3.add(95.0);
        students.add(student3);

        StudentMarks student4 = new StudentMarks("Alice");
        student4.add(79.5);
        student4.add(82.5);
        student4.add(87.0);
        students.add(student4);

        StudentMarks student5 = new StudentMarks("Emily");
        student5.add(92.5);
        student5.add(91.0);
        student5.add(88.5);
        students.add(student5);

        Collections.sort(students);

        for (StudentMarks student: students){
            System.out.println(student);
        }

    }

}
