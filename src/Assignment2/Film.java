package Assignment2;

public class Film extends DigitalContent {


    private String cast;


    public Film(String title, String publisher, String released, String cast) {
        super(title, publisher, released);
        this.cast = cast;
    }


    public void setCast(String cast) {
        this.cast = cast;
    }


    public String getCast() {
        return cast;
    }


    public String toString() {
        return super.toString() + " Cast: " + cast;
    }

    @Override
    public boolean match(String query) {
        return super.match(query) || cast.toLowerCase().contains(query.toLowerCase());
    }

}
