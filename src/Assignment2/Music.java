package Assignment2;

public class Music extends DigitalContent {


    private String artist;


    public Music(String title, String publisher, String released, String artist) {
        super(title, publisher, released);
        this.artist = artist;
    }


    public void setArtist(String artist) {
        this.artist = artist;
    }


    public String getArtist() {
        return artist;
    }


    public String toString() {
        return super.toString() + " Artist: " + artist;
    }

    @Override
    public boolean match(String query) {
        return super.match(query) || artist.toLowerCase().contains(query.toLowerCase());
    }

}
