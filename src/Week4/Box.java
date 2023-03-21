package Week4;

public class Box {

    private double height;
    private double width;
    private double depth;

    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getDepth() {
        return this.depth;
    }

    public boolean fits(Box box) {

        String doesFit = String.valueOf((this.height < box.height && this.width < box.width && this.depth < box.depth));
        System.out.println(doesFit);
        return (this.height < box.height && this.width < box.width && this.depth < box.depth);
    }

    public String toString(){
        return "Height: " + getHeight() + "\nWidth: " + getWidth() + "\nDepth: " + getDepth();
    }

    public static void main(String[] args){
        System.out.println("test");
    }
}
