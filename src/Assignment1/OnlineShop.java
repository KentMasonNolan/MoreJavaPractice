package Assignment1;

import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Test");

        do{

            System.out.println("\nPlease pick one of the following");
            System.out.println("A. Display inventory");
            System.out.println("B. Rate Product");
            System.out.println("C. Exit");

            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Case 1");
                    break;
                case 2:
                    System.out.println("Case 2");
                    break;
                case 3:
                    System.out.println("Case 3");
                    System.exit(0);
                    break;
                default:
                    System.out.println("PLease pick a real option, you dick");
            }


        }while (true);
    }
}
