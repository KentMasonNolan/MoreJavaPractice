package Exam_PracW1;

import java.util.Scanner;

public class Print {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the message?");
        String message = input.next();
        System.out.println("The message is " +"\"" + message + "\".");


    }
}
