package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShopApp {

    private static int nProduct = 0;
    private Product[] inventory = new Product[5];

    private static OnlineShop onlineShop = new OnlineShop();

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Test");

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

            System.out.println("\nPlease pick one of the following");
            System.out.println("A. Display inventory");
            System.out.println("B. Rate Product");
            System.out.println("C. Exit");

            try {

                //Add error checking for an int being input rather than string
                char menu = input.next().trim().toUpperCase().charAt(0);

                switch (menu) {
                    case 'A':

                        System.out.println(onlineShop.toString());

                        break;
                    case 'B':
                        System.out.println(onlineShop.toString());
                        ShopApp.rateProduct();
                        break;

                    case 'C':
                        System.out.println("Have a lovely day");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("PLease pick a real option, you dick");
                        throw new Exception("Illegal Operation" + menu);
                }
            } catch (InputMismatchException error) {
                System.out.println("Don't be a dickhead");
                char menu = input.next().toLowerCase().charAt(0);
            }
        } while (true);
    }

    public static void rateProduct(){


        System.out.println("\nPlease select a product to rate (1-5)");
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();
        OnlineShop.getProduct(selection);
        System.out.println(OnlineShop.getProduct(selection));

        System.out.println("Please enter a rating between 0.0 to 5.0");
        double productRating = input.nextDouble();
        onlineShop.getProduct(selection).rateReliability(productRating);
        System.out.println(productRating);

//        Product.rateReliability(inventory[selection-1], productRating);
//        System.out.println(inventory[selection]);
    }
}
