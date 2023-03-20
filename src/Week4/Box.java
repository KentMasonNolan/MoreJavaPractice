package Week4;

public class Box {

    private double height;
    private double width;
    private double depth;
    private boolean full = false;

    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.full = false;
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

    public void setFull(boolean full) {
        this.full = full;
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

    public boolean getFull() {
        return this.full;
    }

    public boolean fits(double height, double width, double depth) {
        if (this.height < height && this.width < width && this.depth < depth) {
            return true;
        }
        return false;
    }


    public String toString(){
        return "Height: " + this.height + "\nWidth: " + this.width + "\nDepth: " + this.depth + "\nIs it full?: " + this.full ;
    }

    public static void main(String[] args){
        System.out.println("test");
    }
}
