import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        float firstInput = input.nextInt();
        System.out.println("Enter the second number");
        int secondInput = input.nextInt();
        System.out.println("Enter the third number");
        int thirdInput = input.nextInt();

        double average = (firstInput + secondInput + thirdInput) / 3;
        System.out.println(average);
    }
}