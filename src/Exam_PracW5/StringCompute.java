package Exam_PracW5;

import java.util.Scanner;

public class StringCompute {

    private String str;

    public StringCompute(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int countOccurances(char ch){
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }

//    public boolean hasOnlyDigits(){
//       if (Character.isDigit()
//        }
//
//        return false;
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please write a string: ");
        String str = input.nextLine();

        StringCompute str1 = new StringCompute(str);


        System.out.println("Your string is: " + str1);
        System.out.println("We will now check how many letter 'a's are in the string. There are: " + str1.countOccurances('a') + "a's in the string");
//        System.out.println("Now we will check if the string contains any digits. Computer, are there any digits? " + hasOnlyDigits());




    }
}
