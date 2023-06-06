package Exam_PracW6;

import java.util.Objects;
import java.util.Scanner;

public class TrafficLight {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Please Type a valid input string.");
            System.out.println("Your options are: “RED”, “YELLOW” and “GREEN”");
            String userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("redred")){
                System.exit(3);
            }

            for (int i = 0; i < Lights.values().length; i++) {
                if (userInput.equalsIgnoreCase(Lights.values()[i].name())){
                    System.out.println(Lights.values()[i]);
                }
            }
        }
    }

}
