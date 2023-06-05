package Exam_PracW3;

import java.util.Scanner;

public class CoinChanger {

    int ten;
    int twenty;
    int fifty;
    int oneDollar;
    int twoDollar;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Number of 10c coins:");
        double tenCoins = input.nextDouble();
        System.out.println("Number of 20c coins:");
        double twentyCoins = input.nextDouble();
        System.out.println("Number of 50c coins:");
        double fiftyCoins = input.nextDouble();
        System.out.println("Number of $1 coins:");
        double dollarCoins = input.nextDouble();
        System.out.println("Number of $2 coins:");
        double twoDollarCoins = input.nextDouble();




        System.out.println("The total value of the coin collection is:\n");


    }
}
