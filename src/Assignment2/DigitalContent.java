/***

 *

 * Student Name Kent Nolan

 * Student ID 20119784

 * Course Code ENSE 602

 * Assessment Item (Assessment B)

 *
 **/

package Assignment2;


public abstract class DigitalContent implements Comparable<DigitalContent> {
    private String title;
    private String publisher;
    private String released;

    // Constructs a DigitalContent object with the given title, publisher, and release date.
    public DigitalContent(String title, String publisher, String released) {
        this.title = title;
        this.publisher = publisher;
        this.released = released;
    }

    // Sets the title of the digital content.
    public void setTitle(String title) {
        this.title = title;
    }

    // Sets the publisher of the digital content.
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Sets the release date of the digital content.
    public void setReleased(String released) {
        this.released = released;
    }

    // Returns the title of the digital content.
    public String getTitle() {
        return title;
    }

    // Returns the publisher of the digital content.
    public String getPublisher() {
        return publisher;
    }

    // Returns the release date of the digital content.
    public String getReleased() {
        return released;
    }

    // Returns a string representation of the digital content.
    public String toString() {
        return "Title: " + title + " Publisher: " + publisher + " Released: " + released;
    }

    // Checks if the digital content matches the given query.
    public boolean match(String query) {
        return title.toLowerCase().contains(query.toLowerCase()) || publisher.toLowerCase().contains(query.toLowerCase())
                || released.toLowerCase().contains(query.toLowerCase());
    }

    // Compares the digital content with another digital content based on title.
    public int compareTo(DigitalContent content) {
        return title.compareTo(content.title);
    }
}
