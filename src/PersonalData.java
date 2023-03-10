import java.util.Scanner;

public class PersonalData {

    public static void main(String[] args) {

        Person kent = new Person();

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name? ");
        kent.name = input.nextLine();

        System.out.println("What is your favorite book? ");
        kent.favBook = input.nextLine();

        System.out.println("What is your date of birth? ");
        kent.dateOfBirth = input.nextLine();

        System.out.println("What is your favorite film? ");
        kent.favFilm = input.nextLine();

        System.out.println("What are your interests? ");
        kent.interest = input.nextLine();

        System.out.println("\nName: " + kent.name);
        System.out.println("Birthday: " + kent.dateOfBirth);
        System.out.println("Interests: " + kent.interest);
        System.out.println("Favorite Book: " + kent.favBook);
        System.out.println("Favorite Film: " + kent.favFilm);



    }
}