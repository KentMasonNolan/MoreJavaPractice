package Week2;

import java.util.Scanner;

public class TimeConvert {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of seconds: ");
        int totalSeconds = input.nextInt();

        System.out.println(totalSeconds + " seconds is equivalent to: ");

        int hours = totalSeconds/3600;
        System.out.println(hours + " hours");

        totalSeconds = totalSeconds - hours*3600;

        int minutes = totalSeconds/60;
        System.out.println(minutes+ " minutes");

        totalSeconds = totalSeconds - minutes*60;

        System.out.println(totalSeconds + " seconds");

    }
}