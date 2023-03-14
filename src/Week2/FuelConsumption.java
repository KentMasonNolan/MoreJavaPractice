package Week2;

import java.util.Scanner;

public class FuelConsumption {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of miles: ");
        double miles = input.nextDouble();

        System.out.println("Enter the gallons of fuel used: ");
        double gallons = input.nextDouble();

        double gallonMiles = miles/gallons;
        System.out.println("Miles Per Gallon: " + gallonMiles);

    }
}
