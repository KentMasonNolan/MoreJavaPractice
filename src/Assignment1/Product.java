package Assignment1;

public class Product {
    static String modelName;
    static String manufacturerName;
    static double retailPrice;
    static double reliabilityRating;
    int numberOfConsumersRated;


public Product(String modelName, String manufacturerName, double retailPrice) {
        Product.modelName = modelName;
        Product.manufacturerName = manufacturerName;
        Product.retailPrice =retailPrice;
        reliabilityRating = 0;
        this.numberOfConsumersRated = 0;
    }

    public static double getReliabilityRating(int selection) {

        return reliabilityRating;
    }


    public void setReliabilityRating(double reliabilityRating) {
        this.reliabilityRating = reliabilityRating;
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
