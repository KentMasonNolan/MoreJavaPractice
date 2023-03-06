public class PersonalData {

    public static void main(String[] args) {

        Person kent = new Person();

        kent.name = "Kent Nolan";
        kent.favBook = "Captain Corelli's Mandolin ";
        kent.dateOfBirth = "Oct 16";
        kent.favFilm = "Commando";
        kent.interest = "Running";

        System.out.println("Name: " + kent.name);
        System.out.println("Birthday: " + kent.dateOfBirth);
        System.out.println("Interests: " + kent.interest);
        System.out.println("Favorite Book: " + kent.favBook);
        System.out.println("Favorite Film: " + kent.favFilm);



    }
}