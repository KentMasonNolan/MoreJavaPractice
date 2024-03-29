/***
 *
 * Student Name Kent Nolan
 * Student ID 20119784
 * Course Code ENSE 602
 * Assessment Item (Assessment B)
 *
 **/

package Assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Client implements Play {

    public StreamingService streaming = new StreamingService();


    // Method to output the query result from the streaming service
    public static void stream(StreamingService streaming, String query) {

        ArrayList matches = streaming.match(query);
        System.out.println("Matching query: \"" + query + "\"");
        Collections.sort(matches);
        for (Object dc : matches) {

            System.out.println(dc);
        }
        if (matches.size() == 0) {
            System.out.println("Sorry, nothing was found.");
        }
        System.out.println("Total of: " + matches.size() + " matches \n");

    }


    @Override
    public DigitalContent getCurrentStream() {
        for (int i = 0; i < streaming.content.size(); i++) {
            if (streaming.content.get(i).currentlyStreamed) {
                return streaming.content.get(i);
            }
        }
        return null;
    }


    @Override
    public void stream(String query) {
        stream(streaming, query);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Client c1 = new Client();

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
        c1.streaming.add(theWrathofKhan);
        c1.streaming.add(theSearchforSpock);
        c1.streaming.add(generations);
        c1.streaming.add(firstContact);
        c1.streaming.add(insurrection);
        c1.streaming.add(intoDarkness);

        c1.streaming.add(nofx);
        c1.streaming.add(refused);
        c1.streaming.add(riseAgainst);
        c1.streaming.add(theBronx);
        c1.streaming.add(timeOfOurLives);


        while (true) {
            System.out.println("Please select from the following:\n");


            try {
                System.out.println("A. Display Digital Content library");
                System.out.println("B. Display currently streaming DigitalContent");
                System.out.println("C. Match Digital Content to Stream");
                System.out.println("D. Stop streaming");
                System.out.println("E. Quit Client Application");

                String menu = String.valueOf(input.nextLine().charAt(0)).toLowerCase();

                switch (menu) {
                    case "a":
                        System.out.println("A");
                        for (Object dc : c1.streaming.content) {
                            System.out.println(dc);
                        }
                        break;
                    case "b": {
                        c1.getCurrentStream();
                        String output = "Nothing is currently playing\n";
                        for (int i = 0; i < c1.streaming.content.size(); i++) {
                            if (c1.streaming.content.get(i).currentlyStreamed) {
                                output = c1.streaming.content.get(i).toString();
                            }
                        }
                        System.out.println(output);
                    }
                    break;
                    case "c":
                        System.out.println("Please type what you would like to play");
                        String selection = input.nextLine();
                        stream(c1.streaming, selection);
                        break;
                    case "d":
                        c1.stop();
                        break;
                    case "e":
                        System.out.println("Peace out");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Your input was not a valid option. Please try again or \"E\" to quit");
                        break;
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("\n\nYou must input integer values");
                System.out.println("Exceptional event: " + inputMismatchException + "\n");
                input.next();
            }


        }


    }

    public void stop() {
        for (int i = 0; i < streaming.content.size(); i++) {
            if (streaming.content.get(i).currentlyStreamed) {
                streaming.content.get(i).currentlyStreamed = false;
            }
        }


    }
}