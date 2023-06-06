package Exam_PracW4;

import java.util.Arrays;
import java.util.Scanner;

public class Library {

    private Book[] books;
    private int cap;
    private int bookCount = 0;

public Library(int capacity){

    if (capacity < 1){
        this.books = new Book[1];
        cap = 1;
    }
    else {
        this.books = new Book[capacity];
        cap = capacity;
    }
}

public boolean addBook(Book abook) {
    if (this.bookCount >= this.cap) {
        return false;
    }
    this.books[this.bookCount] = abook;
    this.bookCount++;
    return true;
}

    public Book borrow(String title){
        for (int i = 0; i < bookCount; i++) {
            if (books[i].Title.equals(title)){
                return books[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {

        return "Library{" + "books=" + Arrays.toString(books) + ", capacity=" + cap + ", bookCount=" + bookCount + '}';
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Library library = new Library(5);
        Book b1 = new Book("Programming 2 Notes","K. Johnson");
        library.addBook(b1);
        library.addBook(new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling"));
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("Where the Wild Things Are", "Maurice Sendak"));
        library.addBook(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams"));

        System.out.println(library.books[2]);

    }
}
