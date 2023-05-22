package Assignment2;

public class Music extends DigitalContent {

    private String artist;

    // Constructs a Music object with the given title, publisher, release date, and artist.
    public Music(String title, String publisher, String released, String artist) {
        super(title, publisher, released);
        this.artist = artist;
    }

    // Sets the artist of the music.
    public void setArtist(String artist) {
        this.artist = artist;
    }

    // Returns the artist of the music.
    public String getArtist() {
        return artist;
    }

    // Returns a string representation of the music, including the artist.
    public String toString() {
        return super.toString() + " Artist: " + artist;
    }

    // Checks if the music matches the given query, including the artist.
    @Override
    public boolean match(String query) {
        return super.match(query) || artist.toLowerCase().contains(query.toLowerCase());
    }

}
