package Exam_PracW8;

public class Rectangle extends Shape{

    private double length;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    private double width;

    @Override
    public double computeArea(double radius) {
        return 0;
    }

    @Override public double computeArea(double length, double width){
        return (length*width);
    }

}
