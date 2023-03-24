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
}
