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
public Product(String modelName, String manufacturerName) {
        this.modelName = modelName;
        this.manufacturerName = manufacturerName;
        this.retailPrice =0;
        this.reliabilityRating = 0;
        this.numberOfConsumersRated = 0;
    }


    public static void rateReliability(Product product, double newRating) {
        if (newRating >= 0.0 && newRating <= 5.0) {
            product.reliabilityRating = (product.reliabilityRating * product.numberOfConsumersRated + newRating) / (++product.numberOfConsumersRated);
        } else {
            System.out.println("Invalid rating value. Please retry.");
        }
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
