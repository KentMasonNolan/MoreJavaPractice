package Exam_PracW1;

import java.util.Scanner;

public class ThreeAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        double firstNumber = input.nextInt();
        System.out.println("Enter the second number");
        double secondNumber = input.nextInt();
        System.out.println("Enter the third number");
        double thirdNumber = input.nextInt();

        double average = (thirdNumber + secondNumber + firstNumber) / 3;

        System.out.println("The average of the numbers is: " + average);

    }



}
