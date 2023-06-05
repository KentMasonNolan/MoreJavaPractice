package Exam_PracW2;

import java.util.Scanner;

public class Book {

    String title;
    String author;
    int numberOfPages;


    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;

        if (numberOfPages <= 0) {
            this.numberOfPages = 0;
        } else {
            this.numberOfPages = numberOfPages;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the title of the book");
        String userTitle = input.nextLine();
        System.out.println("Please enter the author name");
        String userAuthor = input.nextLine();
        System.out.println("Please enter the number of pages");
        int userPages = input.nextInt();

        Book b1 = new Book(userTitle, userAuthor, userPages);
        System.out.println("The book title is: " + b1.title);
        System.out.println("The book author is: " + b1.author);
        System.out.println("The book has " + b1.numberOfPages +  " pages\n");
    }
}
