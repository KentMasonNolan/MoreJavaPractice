import java.util.Scanner;

public class FahrenheitToCelcius {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the temp in f: ");
        int temp = input.nextInt();

        System.out.println("The temperature in Celsius is" +" "+ temp + "F is: " + ((temp - 32))*5/9 + "C");
    }
}


