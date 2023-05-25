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

public class StreamingService {

    public ArrayList<DigitalContent> content;

    // Constructs a StreamingService object with an empty list of digital content.
    public StreamingService() {
        content = new ArrayList<>();
    }

    // Adds a digital content item to the streaming service.
    public void add(DigitalContent item) {
        if (item != null) {
            content.add(item);
        }
    }

    // Returns an ArrayList of digital content items that match the given query.
    public ArrayList match(String query) {
        ArrayList<DigitalContent> matchedItems = new ArrayList<>();
        int flag = 0;

        for (DigitalContent dc : content) {
            if (dc.match(query)) {
                if (flag == 0) {
                    flag++;
                    dc.currentlyStreamed = true;
                }
                matchedItems.add(dc);
            }
        }

        return matchedItems;
    }

}
