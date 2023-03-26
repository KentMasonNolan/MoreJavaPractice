package Assignment1;

public class Product {
     String modelName;
     String manufacturerName;
    double retailPrice;
    static double reliabilityRating;
    int numberOfConsumersRated;


public Product(String modelName, String manufacturerName, double retailPrice) {
        this.modelName = modelName;
        this.manufacturerName = manufacturerName;
        this.retailPrice =retailPrice;
        reliabilityRating = 0;
        this.numberOfConsumersRated = 0;
    }


    public void rateReliability(double newRating) {
        if (newRating >= 0.0 && newRating <= 5.0) {
            reliabilityRating = (reliabilityRating * numberOfConsumersRated + newRating) / (++numberOfConsumersRated);
        } else {
            System.err.println("Invalid rating value. Please retry.");
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
