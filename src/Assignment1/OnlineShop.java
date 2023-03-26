package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OnlineShop {

    private static int nProduct = 0;
    private static Product[] inventory = new Product[5];

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Test");

        Product p1 = new Product("USS Enterprise", "Starfleet", 12400);
        OnlineShop.add(p1);
        Product p2 = new Product("USS Voyager", "Starfleet", 9800);
        OnlineShop.add(p2);
        Product p3 = new Product("Borg Cube", "The Collective", 1337);
        OnlineShop.add(p3);
        Product p4 = new Product("USS Defiant", "Starfleet", 15400);
        OnlineShop.add(p4);
        Product p5 = new Product("Vor'cha-class attack cruiser", "Klingon Empire", 8000);
        OnlineShop.add(p5);

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

                        for (int i=0; i<inventory.length; i++){
                            System.out.println(inventory[i]);
                        }

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

    public static void add(Product product) {
        if (nProduct < 5) {
            inventory[nProduct++] = product;
//            System.out.println(inventory[nProduct]);
        } else
            System.out.println("Cannot add more than 5 products");
    }

    public static String rateProduct(){
        System.out.println("Please select a product to rate (1-5)");
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();
//        Product.getReliabilityRating(selection);
        return "a";
    }
}
