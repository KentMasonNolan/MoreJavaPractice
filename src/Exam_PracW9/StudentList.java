package Exam_PracW9;

import java.util.ArrayList;

public class StudentList {

    private ArrayList<Student> sList;

    public StudentList(ArrayList<Student> sList) {
        this.sList = sList;
    }

    public void addStudent(Student student){
        sList.add(student);
    }

    @Override
    public String toString() {
        String output = "";

        for (int i = 0; i < sList.size(); i++) {
            output += sList.get(i);
            output += "\n";
        }

        return output;
    }

    public boolean contains(Student student){
        return sList.contains(student);
    }

    public static void main(String[] args) {

    }
}
