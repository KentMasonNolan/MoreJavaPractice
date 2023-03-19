package Week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int productCost = 16;

        System.out.printf("Please input the amount of products currently on hand: ");

        Scanner input = new Scanner(System.in);
        int nProducts = input.nextInt();

        int totalCost = productCost * nProducts;

        System.out.println("The total cost is: $" + totalCost);

    }

//        List<Integer> grades = Arrays.asList(5,6,2,0,4,5);
////        grades.add(5);
////        grades.add(5);
////        grades.add(1, 7);
//
//        grades.replaceAll(integer -> integer * 2);
//
//        System.out.println(Arrays.toString(grades.toArray()));
//        System.out.println(grades.size());
//
////        System.out.println(grades.contains(5));
////
////        String password = "pants";
////        System.out.println("Guess the password: ");
////
////        Scanner scanner = new Scanner(System.in);
////        String guess = scanner.nextLine();
////
////        boolean passwordCheckTrue = password.equalsIgnoreCase(guess);
////        System.out.println(passwordCheckTrue);
////
////        if (passwordCheckTrue){
////            System.out.println("Good work. ");
////        } else {
////            System.out.println("You were wrong! ");
////        }
//    }
}