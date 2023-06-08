package Exam_Prac_GPTQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {

    ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    private void addBook(Book book){
        books.add(book);
    }

    private void removeBook(String bookTitle){
        for (int i = 0; i < books.size(); i++) {
            if (Objects.equals(books.get(i).getTitle(), bookTitle)){
                books.remove(i);
            }
        }
    }
    private String searchByAuthor(String author){
        List<Book> booksByAuthor = new ArrayList<>();

        for (Book books : books){
            if (books.getAuthor().equalsIgnoreCase(author)){
                booksByAuthor.add(books);
            }
        }return booksByAuthor.toString();
    }

}
