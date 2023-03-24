package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OnlineShop {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Test");

        Product p1 = new Product("USS Enterprise", "Starfleet", 500);
        Product p2 = new Product("USS Voyager", "Starfleet", 500);
        Product p3 = new Product("Borg Cube", "The Collective", 500);
        Product p4 = new Product("USS something", "Not Starfleet", 500);
        Product p5 = new Product("USS anything", "Not Starfleet", 500);

        do {

            System.out.println("\nPlease pick one of the following");
            System.out.println("A. Display inventory");
            System.out.println("B. Rate Product");
            System.out.println("C. Exit");

            try {

                //Add error checking for an int being input rather than string
                char menu = input.next().toLowerCase().charAt(0);

                switch (menu) {
                    case 'a':
                        System.out.println("Case 1");
                        System.out.println(p1);
//                        list.stream().map(Object::toString).collect(Collectors.joining(","));


                        break;
                    case 'b':
                        System.out.println("Case 2");
                        break;
                    case 'c':
                        System.out.println("Case 3");
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
}
