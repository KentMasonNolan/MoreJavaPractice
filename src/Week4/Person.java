package Week4;

import java.util.Scanner;

public class Person {
    int age;
    double weight;
    boolean student;
    String gender;
    char genderLetter;

    public Person(int age, double weight, boolean student, String gender) {

        this.age = age;
        this.weight = weight;
        this.student = student;
        this.gender = String.valueOf(genderLetter = gender.charAt(0)).toUpperCase();
    }

    public Person() {
        this.age = 0;
        this.weight = 0.0;
        this.student = true;
        this.gender = "M";
    }

    public boolean isStudent() {
        return student;
    }

    public int getAge() {
        return age;
    }

    public int computeDiscountPercent() {
        //this should be a double rather than an int because we want a percentage returned and can multiply any
        //amount and get the true return

        int discount = 0;

        if (age > 65) {
            discount = 100;
        } else if (this.student && this.age >= 10 && this.age <= 20) {
            discount = 50;
        }
        //check what discount a student aged 12 would receive
        if (age %2 == 0){
            discount = 25;
        } else {
            discount = 15;
        }

        return discount;
    }

    public String showData() {
        return "Week2.Person: \n" + "Age: " + age + "\n" + "Weight: " + weight + "\n" + "Is a student? " + student + "\n" + "Gender: " + gender;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the person's age:");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Please enter the person's weight:");
        double weight = input.nextDouble();
        input.nextLine();

        System.out.println("Is the person a student?:");
        boolean student = input.hasNextBoolean();
        input.nextLine();

        System.out.println("Please enter the person's gender:");
        String gender = input.nextLine();

        System.out.println("\nShow data: \n");

        Person p1 = new Person(age, weight, student, gender);
        System.out.println(p1.showData());
    }
}
