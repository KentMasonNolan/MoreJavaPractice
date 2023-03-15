package Week4;

public class Box {

    double height;
    double width;
    double depth;
    boolean full = false;

    public Box(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.full = false;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setDepth(double depth){
        this.depth = depth;
    }
    public void setFull(boolean full){
        this.full = full;
    }
    public double getHeight(){
        return this.height;
    }
    public double getWidth(){
        return this.width;
    }
    public double getDepth(){
        return this.depth;
    }
    public boolean getFull(){
        return this.full;
    }

    public static void main(String[] args){
        System.out.println("plants");
    }
}
