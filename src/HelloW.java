import java.util.Scanner;

public class HelloW {

    public static void main(String[] args) {

        System.out.println("What is the message?");

        Scanner input = new Scanner(System.in);
        String message = input.nextLine();

        System.out.println("The message is \"" + message + "\".");
    }
}
