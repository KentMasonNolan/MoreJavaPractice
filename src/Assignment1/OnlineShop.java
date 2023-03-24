package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Test");

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
