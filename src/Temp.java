import java.util.Scanner;

public class Temp {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the temp in f: ");
        int temp = input.nextInt();

        System.out.println("The temperature in Celcius is" +" "+ temp + "F is: " + ((temp - 32))*5/9 + "C");
    }
}


