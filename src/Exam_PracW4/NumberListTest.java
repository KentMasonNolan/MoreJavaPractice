package Exam_PracW4;

public class NumberListTest {

    public static void main(String[] args) {


        NumberList Array1 = new NumberList(10);

        System.out.println("List size = " + Array1.size());

        System.out.println("List 1: " + Array1);

        System.out.println("Checking if 7 is in the list: " + Array1.isValid(7));

        System.out.println("If 7 is in the list, we will update to 8");
        Array1.update(7,8);

        System.out.println("List 1: " + Array1);

        System.out.println("The smallest number is: " + Array1.min());
        System.out.println("The largest number is: " + Array1.max());

        System.out.println("The number of zeros in the list is: " + Array1.nonZero());

        System.out.println("The average of the array is: " + Array1.average());

        System.out.println("Checking where 8 is in the list. It is in position " + Array1.getNumber(8));



    }
}
