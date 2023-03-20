package Week4;

public class Sphere {

    private double diameter;
    private double radius;

    public double volume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(this.diameter / 2, 3);
        return volume;
    }
    public double surfaceArea() {
    double area = 4.0 * Math.PI * Math.pow((this.diameter / 2), 2);
    return area;
    }
    public Sphere(double diameter){
        this.diameter = diameter;
    }
    public double radius(){
            radius = (this.diameter)/2;
            return radius;
    }

    @Override
    public String toString() {
        return "The diameter is: " + this.diameter
                + "\nThe radius is: " + radius()
                + "\nThe volume is: " + volume()
                + "\nThe surface area is: " + surfaceArea()
                + "\n\n";
    }
}
