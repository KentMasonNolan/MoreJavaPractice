package Exam_PracW7;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerStackTest {





    public static void main(String[] args) {

        ArrayList integerStack = new ArrayList();

        Scanner input = new Scanner(System.in);

        System.out.println("Please input four numbers to be added to the list: ");
        while (integerStack.size() < 4) {
            int addingNumber = input.nextInt();
            integerStack.add(addingNumber);
        }
        System.out.println(integerStack);

        System.out.println("Now we will reverse it: ");
    }
}
