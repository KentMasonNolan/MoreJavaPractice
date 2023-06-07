package Exam_PracW8;

public class Animal {
    protected int eat;
    protected int happy;

    protected double weight;



    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Animal(){
        this.eat = 0;
        this.happy = 0;
        this.weight = 1.0;
    }
    public void feed(){
    }

    public void soundsLike(){
        
    }
    public String toString(){
        return "Eaten: "+this.eat+" Happy: "+this.happy;
    }
}