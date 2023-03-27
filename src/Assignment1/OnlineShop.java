package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OnlineShop {

    private static Product[] inventory;
    private int nProduct;

    public OnlineShop() {
        inventory = new Product[5];
        nProduct = 0;
    }

    @Override
    public String toString() {
        String s = "";
        int num = 1;
        for (Product eachProduct : inventory) {
            s += (num++) + " " + eachProduct + "\n";
        }
        return s;
    }

    public void add(Product product) {
        if (nProduct < 5) {
            inventory[nProduct++] = product;
        } else
            System.out.println("Cannot add more than 5 products");
    }



    public static Product getProduct(int selection){
        if (selection >= 1 && selection <= 5){
            return inventory[selection-1];
        } else {
            System.out.println("Please pick a product between 1-5");
            return null;
        }
    }
}
