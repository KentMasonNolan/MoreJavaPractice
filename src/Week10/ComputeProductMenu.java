package Week10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComputeProductMenu {



    public static void product() throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Welcome to the calculator.");
            System.out.println("Enter first number:");
            int value1 = input.nextInt();
            System.out.println("Enter second number:");
            int value2 = input.nextInt();
            System.out.println("Product is: " + (value1 * value2));
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("You must input integer values");
            System.err.println("Exceptional event: " + inputMismatchException);
            input.next();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the calculator.");


        while (true) {
            System.out.println("Please select from the following:");
            System.out.println("1. Compute product");
            System.out.println("2. Quit");

            int menu = input.nextInt();

            try {
                switch (menu){
                    case 1:
                        System.out.println("1");
                        break;
                    case 2:
                        System.out.println("2");
                        break;
                    default:
                        System.out.println("default");
                        break;
                }
            } catch (InputMismatchException inputMismatchException){
                System.out.println("You must input integer values");
                System.err.println("Exceptional event: "+inputMismatchException);
                input.next();//remove bad input from the scanner.
            }


        }
    }
}
