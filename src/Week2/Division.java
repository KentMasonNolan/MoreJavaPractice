package Week2;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the numerator: ");
        float num = input.nextFloat();
        System.out.print("Please enter the denominator: ");
        float den = input.nextFloat();

        System.out.println("The fraction input is: " + num + "/" + den );

        if (den != 0){
            float eq = num / den;
            System.out.println("\nThe decimal equivalence is" +" "+ eq);
        }
        else {
            System.out.println( "\nDude, don't divide by zero...");
        }


    }
}