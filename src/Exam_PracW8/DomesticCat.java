package Exam_PracW8;

public class DomesticCat extends Animal{
    public void feed(){
        this.eat+=1;
        this.happy+=10;
    }
    public DomesticCat(){
        System.out.println("Cat object instantiated!");
        this.happy = -10;
    }
    public String toString(){
        return "Cat has "+super.toString();
    }
}
