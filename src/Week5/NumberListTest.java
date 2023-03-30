package Week5;

public class NumberListTest {

    public static void main(String[] args) {

        NumberList array1 = new NumberList();

        System.out.println("Details of the array created by object array1 : \n");

        System.out.println("Size : "+ array1.size());

        System.out.println("String of array: "+ array1.toString());

        NumberList array2 = new NumberList(10); //parameterized constructor is called

        System.out.println("\nDetails of the array created by second object obj2 : \n");

        System.out.println("Size : "+ array2.size());

        System.out.println("String of array: "+ array2.toString());

        System.out.println("Updating value at index 2");

        array2.update(2, -900);

        System.out.println("Updated array: "+ array2.toString());

        System.out.println("Minimum number: "+array2.min());

        System.out.println("Maximum number: "+array2.max());

        System.out.println("Number of non-zero numbers: "+array2.nonZero());

        System.out.println("Average: "+ array2.average());

        System.out.println("Number at 2nd index: "+ array2.getNumber(2));

        System.out.println("Getting Absolute of all numbers");

        array2.absolute();

        System.out.println("Updated array: "+ array2.toString());

        System.out.println("Scaling each number of the array by factor 2: ");

        array2.scale(2);

        System.out.println("Updated array after scaling: "+ array2.toString());

        System.out.println("Getting sub-array from index 0 to 5: ");

        NumberList new_num_list = array2.sub(0,5);

        System.out.println("Displaying sub array: "+new_num_list.toString());

    }

}