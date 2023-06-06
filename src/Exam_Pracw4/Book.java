package Exam_Pracw4;

public class Book {

    public String Title;
   public String Author;

   public Boolean borrowed;

    public Book(String title, String author) {
        Title = title;
        Author = author;
        this.borrowed = false;
    }

    @Override
    public String toString() {
        return "Book{" + "Title='" + Title + '\'' + ", Author='" + Author + '\'' + ", borrowed=" + borrowed + '}';
    }
}
