import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.firstName = "Kent";
        user.lastName = "Nolan";

        System.out.println((user.getFullName()));


        String password = "pants";
        System.out.println("Guess the password: ");

        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();

        boolean passwordCheckTrue = password.toLowerCase().equals(guess.toLowerCase());
        System.out.println(passwordCheckTrue);

        if (passwordCheckTrue){
            System.out.println("Good work. ");
        } else {
            System.out.println("You were wrong! ");
        }
    }
}