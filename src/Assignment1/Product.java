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

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public double getReliabilityRating() {
        return reliabilityRating;
    }

    public void setReliabilityRating(double reliabilityRating) {
        this.reliabilityRating = reliabilityRating;
    }

    public int getNumberOfConsumersRated() {
        return numberOfConsumersRated;
    }

    public void setNumberOfConsumersRated(int numberOfConsumersRated) {
        this.numberOfConsumersRated = numberOfConsumersRated;
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
