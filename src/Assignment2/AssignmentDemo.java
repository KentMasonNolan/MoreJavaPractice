package Assignment2;

import java.util.ArrayList;
import java.util.Collections;

public class AssignmentDemo {

    // Method to output the query result from the streaming service
    public static void outputQueryResult(StreamingService streaming, String query) {

        System.out.println("----------------------------------------");
        ArrayList matches = streaming.match(query);
        System.out.println("Matching query: \"" + query + "\"");
        streaming.match("Orson");
        Collections.sort(matches);
        for (Object dc : matches) {
            System.out.println(dc);
        }
        System.out.println("Total of: " + matches.size() + " matches");
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {

        System.out.println("Welcome to the Streaming Service");

        // Creating film objects

        Film theWrathofKhan = new Film("Star Trek II: The Wrath of Khan", "Paramount Pictures", "1982", "William Shatner, Leonard Nimoy");
        Film theSearchforSpock = new Film("Star Trek III: The Search for Spock", "Paramount Pictures", "1984", "William Shatner, Leonard Nimoy");
        Film generations = new Film("Star Trek Generations", "Paramount Pictures", "1994", "Patrick Stewart, William Shatner");
        Film firstContact = new Film("Star Trek: First Contact", "Paramount Pictures", "1996", "Patrick Stewart, Jonathan Frakes");
        Film insurrection = new Film("Star Trek: Insurrection", "Paramount Pictures", "1998", "Patrick Stewart, Jonathan Frakes");
        Film intoDarkness = new Film("Star Trek Into Darkness", "Paramount Pictures", "2013", "Chris Pine, Zachary Quinto");



        // Creating music objects
        Music bruce = new Music("Born in the USA", "Bruce Springsteen", "1984", "Bruce Springsteen");
        Music vitalogy = new Music("Vitalogy", "Sony", "1994", "Pearl Jam");
        Music ten = new Music("Ten", "Sony", "1991", "Pearl Jam");
        Music elton = new Music("Goodbye Yellow Brick Road", "This", "1973", "Elton John");
        Music weezer = new Music("Weezer", "DGC Records", "1994", "Weezer");

        StreamingService streaming = new StreamingService();

        // Adding films and music to the streaming service
        streaming.add(theWrathofKhan);
        streaming.add(theSearchforSpock);
        streaming.add(generations);
        streaming.add(firstContact);
        streaming.add(insurrection);
        streaming.add(intoDarkness);

        streaming.add(bruce);
        streaming.add(vitalogy);
        streaming.add(elton);
        streaming.add(weezer);
        streaming.add(ten);

        // Outputting query results
        outputQueryResult(streaming, "orson");
        outputQueryResult(streaming, "pearl jam");
        outputQueryResult(streaming, "Bruce");
        outputQueryResult(streaming, "194");
    }
}