package Assignment2;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

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

        Music nofx = new Music("The Decline", "NOFX", "1999", "NOFX");
        Music refused = new Music("The Shape of Punk to Come", "Burning Heart Records", "1998", "Refused");
        Music riseAgainst = new Music("The Sufferer & the Witness", "Geffen Records", "2006", "Rise Against");
        Music theBronx = new Music("The Bronx", "White Drugs", "2003", "The Bronx");
        Music timeOfOurLives = new Music("The Time of Our Lives", "Hollywood Records", "2009", "Miley Cyrus");


        StreamingService streaming = new StreamingService();

        // Adding films and music to the streaming service
        streaming.add(theWrathofKhan);
        streaming.add(theSearchforSpock);
        streaming.add(generations);
        streaming.add(firstContact);
        streaming.add(insurrection);
        streaming.add(intoDarkness);

        streaming.add(nofx);
        streaming.add(refused);
        streaming.add(riseAgainst);
        streaming.add(theBronx);
        streaming.add(timeOfOurLives);

        // Outputting query results
        outputQueryResult(streaming, "punk");
        outputQueryResult(streaming, "refused");
        outputQueryResult(streaming, "drugs");
        outputQueryResult(streaming, "2003");
    }
}