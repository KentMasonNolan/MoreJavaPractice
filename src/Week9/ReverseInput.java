package Week9;

import java.util.Scanner;

public class ReverseInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LinkedList list = new LinkedList(4);

        System.out.println("Please input the first number");
        System.out.println("Please input the second number");
        System.out.println("Please input the third number");
        System.out.println("Please input the fourth number");
        int number = input.nextInt();
    }
}
