/***
 *

 * Student Name: Kent Nolan

 * Student ID: 20119784

 * Course Code: COMP503 - Programing 2

 * Assessment Item: Assignment: Individual Programming Assignment Part A

 *
 **/

package Assignment1;

public class Product {
    private String modelName;
    private String manufacturerName;
    private double retailPrice;
    private double reliabilityRating;
    private int numberOfConsumersRated;


    // Three input constructor
    public Product(String modelName, String manufacturerName, double retailPrice) {
        this.modelName = modelName;
        this.manufacturerName = manufacturerName;
        this.retailPrice =retailPrice;
        this.reliabilityRating = 0;
        this.numberOfConsumersRated = 0;
    }
    // Two input constructor
    public Product(String modelName, String manufacturerName) {
        this.modelName = modelName;
        this.manufacturerName = manufacturerName;
        this.retailPrice =0;
        this.reliabilityRating = 0;
        this.numberOfConsumersRated = 0;
    }

    //Returns model name
    public String getModelName() {
        return modelName;
    }

    //Returns manufacturer name
    public String getManufacturerName() {
        return manufacturerName;
    }

    //Returns retail price
    public double getRetailPrice() {
        return retailPrice;
    }

    //Returns reliability rating
    public double getReliabilityRating() {
        return reliabilityRating;
    }

    // Sets the retail price
    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    //Returns total number of consumers rated
    public int getNumberOfConsumersRated() {
        return numberOfConsumersRated;
    }

    //Function for rating the reliability
    public void rateReliability(double newRating) {
        //Validates the rating is between 1 & 5
        if (newRating >= 0.0 && newRating <= 5.0) {

            //Sets new rating based on standard formula and increments total number of consumers rated
            reliabilityRating = (reliabilityRating * numberOfConsumersRated + newRating) / (++numberOfConsumersRated);
            System.out.println("Thank you. The product has been updated.\n");
        } else {
            System.out.println("Please pick a valid rating option & try again.\n");
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
