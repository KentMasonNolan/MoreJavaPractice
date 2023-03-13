package Week3;

import java.util.Scanner;
import java.lang.Math;

public class CartesianPoint {

    double x;
    double y;

    CartesianPoint(double xx, double yy) {

        x = xx;
        y = yy;

    }

    CartesianPoint() {
        x = 0;
        y = 0;
    }

    public static double distanceFrom(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }


    public boolean onXAxis() {
        // if y is 0 then point is on the x.
        if (y == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean onYAxis() {
        // if x is 0 then point is on the y.
        if (x == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CartesianPoint point1 = new CartesianPoint();

        System.out.println("Point one has been set to 0,0");
        System.out.println("Please input the x coordinate of point 2");
        Double xInput = input.nextDouble();
        System.out.println("Please input the y coordinate of point 2");
        Double yInput = input.nextDouble();

        CartesianPoint point2 = new CartesianPoint(xInput, yInput);

        double totalDistance = distanceFrom(point2.x, point2.y, point1.x, point1.y);

        System.out.println("Point 1 is on the x-axis: " + point1.onXAxis());
        System.out.println("Point 1 is on the y-axis: " + point1.onYAxis());
        System.out.println("Point 2 is on the x-axis: " + point2.onXAxis());
        System.out.println("Point 2 is on the y-axis: " + point2.onYAxis());

        System.out.println("The total distance between the two points is :" + totalDistance);



    }
}