/***

 *

 * Student Name Kent Nolan

 * Student ID 20119784

 * Course Code ENSE 602

 * Assessment Item (Assessment B)

 *
 **/

package Assignment2;

public class Film extends DigitalContent {

    private String cast;

    // Constructs a Film object with the given title, publisher, release date, and cast.
    public Film(String title, String publisher, String released, String cast) {
        super(title, publisher, released);
        this.cast = cast;
    }

    // Sets the cast of the film.
    public void setCast(String cast) {
        this.cast = cast;
    }

    // Returns the cast of the film.
    public String getCast() {
        return cast;
    }

    // Returns a string representation of the film, including the cast.
    public String toString() {
        return super.toString() + " Cast: " + cast;
    }

    // Checks if the film matches the given query, including the cast.
    @Override
    public boolean match(String query) {
        return super.match(query) || cast.toLowerCase().contains(query.toLowerCase());
    }
}
