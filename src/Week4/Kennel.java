package Week4;

public class Kennel {

    public static void main(String[] args){

        Dog d1 = new Dog("Kent", 3);
        Dog d2 = new Dog("Jamie", 5);
        Dog d3 = new Dog("James", 6);
        Dog d4 = new Dog("Kora", 5);

        System.out.println(d1);
        System.out.println("The dog's age in human years is : " + d1.inPersonYears());
        System.out.println(d2);
        System.out.println("The dog's age in human years is : " + d2.inPersonYears());

        System.out.println(d3);
        System.out.println("The dog's age in human years is : " + d3.inPersonYears());

        System.out.println(d4);
        System.out.println("The dog's age in human years is : " + d4.inPersonYears());

    }
}
