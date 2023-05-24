package Assignment2;

import java.util.ArrayList;

public class StreamingService {

    private ArrayList<DigitalContent> content;

    // Constructs a StreamingService object with an empty list of digital content.
    public StreamingService() {
        content = new ArrayList<>();
    }

    // Adds a digital content item to the streaming service.
    public void add(DigitalContent item) {
        content.add(item);
    }

    // Returns an ArrayList of digital content items that match the given query.
    public ArrayList match(String query) {
        ArrayList<DigitalContent> matchedItems = new ArrayList<>();

        for (DigitalContent dc : content) {
            if (dc.match(query))
                matchedItems.add(dc);
        }

        return matchedItems;
    }

}
