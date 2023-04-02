/***
 *

 * Student Name: Kent Nolan

 * Student ID: 20119784

 * Course Code: COMP503 - Programing 2

 * Assessment Item: Assignment: Individual Programming Assignment Part A

 *
 **/

package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShopApp {

    private Product[] inventory = new Product[5];

    private static OnlineShop onlineShop = new OnlineShop();

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Product p1 = new Product("USS Enterprise", "Starfleet", 12400);
        onlineShop.add(p1);
        Product p2 = new Product("USS Voyager", "Starfleet", 9800);
        onlineShop.add(p2);
        Product p3 = new Product("Borg Cube", "The Collective", 1337);
        onlineShop.add(p3);
        Product p4 = new Product("USS Defiant", "Starfleet", 15400);
        onlineShop.add(p4);
        Product p5 = new Product("Vor'cha-class attack cruiser", "Klingon Empire", 8000);
        onlineShop.add(p5);

        do {

            System.out.println("Please pick one of the following");
            System.out.println("A. Display inventory");
            System.out.println("B. Rate Product");
            System.out.println("C. Exit");

            try {

                //Add error checking for an int being input rather than string
                char menu = input.next().trim().toUpperCase().charAt(0);

                switch (menu) {
                    case 'A':

                        System.out.println("Product List: ");
                        System.out.println(onlineShop.toString());

                        break;
                    case 'B':
                        System.out.println("Product List: ");
                        System.out.println(onlineShop.toString());
                        ShopApp.rateProduct();
                        break;

                    case 'C':
                        System.out.println("Have a lovely day");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please pick a valid option");
                        throw new Exception("Illegal Operation" + menu);
                }
            } catch (InputMismatchException error) {
                System.out.println("Please pick a valid option");
                char menu = input.next().toLowerCase().charAt(0);
            }
        } while (true);
    }

    public static void rateProduct(){

        System.out.println("\nPlease select a product to rate (1-5)");

        // get value for product selection
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();

        // acepts product selection and returns product
        OnlineShop.getProduct(selection);
        System.out.println(OnlineShop.getProduct(selection));

        // gets the rating for the selected product
        System.out.println("\nPlease enter a rating between 0.0 to 5.0");
        double productRating = input.nextDouble();

        // sets the rating for the selected product
        onlineShop.getProduct(selection).rateReliability(productRating);



    }
}
