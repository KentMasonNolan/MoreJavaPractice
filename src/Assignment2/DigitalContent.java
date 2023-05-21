package Assignment2;

import java.util.ArrayList;


public abstract class DigitalContent implements Comparable<DigitalContent>{


    private String title;
    private String publisher;
    private String released;


    public DigitalContent(String title, String publisher, String released) {
        this.title = title;
        this.publisher = publisher;
        this.released = released;
    }


    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    // getters
    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getReleased() {
        return released;
    }


    public String toString() {
        return "Title: "+title +" Publisher: "+publisher+ " Released: " + released;
    }

    public boolean match(String query){
        return title.toLowerCase().contains(query.toLowerCase()) || publisher.toLowerCase().contains(query.toLowerCase())
                || released.toLowerCase().contains(query.toLowerCase());
    }

    public int compareTo(DigitalContent content){
        return title.compareTo(content.title);
    }
}