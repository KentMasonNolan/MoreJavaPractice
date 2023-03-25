package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OnlineShop {

    private int nProduct = 0;
    private Product[] inventory = new Product[5];

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Test");

        Product p1 = new Product("USS Enterprise", "Starfleet", 12400);

        Product p2 = new Product("USS Voyager", "Starfleet", 9800);
        Product p3 = new Product("Borg Cube", "The Collective", 1337);
        Product p4 = new Product("USS something", "Not Starfleet", 500);
        Product p5 = new Product("USS anything", "Not Starfleet", 500);

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

                        System.out.println("1. " + p1);
                        System.out.println("2. " + p2);
                        System.out.println("3. " + p3);
                        System.out.println("4. " + p4);
                        System.out.println("5. " + p5);

                        break;
                    case 'B':
                        OnlineShop.rateProduct();
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

    public void add(Product product) {
        if (nProduct < 5) {
            inventory[nProduct++] = product;
        } else
            System.out.println("Cannot add more than 5 products");
    }

    public static String rateProduct(){
        System.out.println("Please select a product to rate (1-5)");
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();
        selection = selection * 3;
        return String.valueOf(selection);
    }
}
