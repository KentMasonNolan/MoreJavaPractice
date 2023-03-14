package Week2;

import java.util.Scanner;

public class TimeDuration {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of hours: ");
        int hours = input.nextInt();
        System.out.println("Enter the number of minutes: ");
        int minutes = input.nextInt();
        System.out.println("Enter the number of seconds: ");
        int seconds = input.nextInt();

        int totalSeconds = seconds + minutes*60 + hours*3600;

        System.out.println("The total number of seconds is " + totalSeconds);

    }
}