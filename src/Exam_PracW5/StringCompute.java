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

    public boolean hasOnlyDigits() {

        char[] chars = this.str.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(){
        for (int i = 0; i < this.str.length()/2; i++) {
            if (this.str.charAt(i) != this.str.charAt(this.str.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return  str ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please write a string: ");
        String str = input.nextLine();

        StringCompute str1 = new StringCompute(str);


        System.out.println("Your string is: " + str1);
        System.out.println("We will now check how many letter 'a's are in the string. There are: " + str1.countOccurances('a') + "a's in the string");
        System.out.println("Now we will check if the string contains any digits. Computer, are there any digits? " + str1.hasOnlyDigits());

        System.out.println("Now we will check if your string is a Palindrome" + "Is it a Palindrome? " + str1.isPalindrome());




    }
}
