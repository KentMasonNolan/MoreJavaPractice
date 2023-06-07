package Exam_PracW8;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
@Override
    public double computeArea(double radius){
        return (Math.PI*Math.pow(radius, 2));
    }

    @Override
    public double computeArea(double length, double width) {
        return 0;
    }
}
