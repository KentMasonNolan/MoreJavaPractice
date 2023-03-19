package Week3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the title of the book");
        String title = input.nextLine();
        System.out.println("Please enter the author name");
        String author = input.nextLine();
        System.out.println("Please enter the number of pages");
        int numberOfPages = input.nextInt();

        while (numberOfPages <= 0) {
            System.out.println("Please enter the number of pages");
            numberOfPages = input.nextInt();
        }
        System.out.println("The book title is:" + " " + title);
        System.out.println("The author's name is:" + " " + author);
        System.out.println("The book has:" + " " + numberOfPages + " " + "pages");
    }
}