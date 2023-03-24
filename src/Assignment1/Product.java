package Assignment1;

public class Product {
    String modelName;
    String manufacturerName;
    double retailPrice;
    double reliabilityRating;
    int numberOfConsumersRated;


public Product(String modelName, String manufacturerName, double retailPrice) {
        this.modelName = modelName;
        this.manufacturerName = manufacturerName;
        this.retailPrice =retailPrice;
        this.reliabilityRating = 0;
        this.numberOfConsumersRated = 0;
    }

    @Override
    public String toString() {
        return "Name: " + modelName
                + ", " + manufacturerName
                + ", $" + retailPrice
                + ", Rating of: " + reliabilityRating
                + " (based on " + numberOfConsumersRated + " customer ratings)";

    }
}
