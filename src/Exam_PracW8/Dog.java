package Exam_PracW8;

public class Dog extends Animal{

    public void feed(){
        this.eat += 5;
        this.happy += 1;
    }

    public Dog() {
        System.out.println("Dog object instantiated!");
    }

    @Override
    public String toString() {
        return "Dog has " + super.toString();
    }
}
