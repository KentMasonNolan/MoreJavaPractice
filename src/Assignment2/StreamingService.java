package Assignment2;

import java.util.ArrayList;


public class StreamingService {

    private ArrayList<DigitalContent> content;

    public StreamingService() {
        content = new ArrayList<>();
    }

    public void add(DigitalContent item) {
        content.add(item);
    }

    public ArrayList match(String query)
    {
        ArrayList<DigitalContent> matchedItems = new ArrayList<>();

        for(DigitalContent dc : content)
        {
            if(dc.match(query))
                matchedItems.add(dc);
        }

        return matchedItems;
    }

}
