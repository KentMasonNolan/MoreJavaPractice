package Week2;

import java.util.Scanner;

public class ConvertDistance {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of miles: ");
        int milesInput = input.nextInt();

        double kilometers = milesInput * 1.60935;

        if (kilometers > 0){
            System.out.println("The number of kms is: " + kilometers);
        }
        else {
            System.out.println("Please enter a value greater than 0!");
        }

    }
}