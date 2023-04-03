package Week6;

import java.util.Scanner;

public class StringCompute {

    public String str;

    StringCompute(String str){
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
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == ch){
                count ++;
            }
        }
        System.out.println(count);
        return count;
    }

    public boolean hasOnlyDigits(){
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)){
                System.out.println("False");
                return false;
            }
        }
        System.out.println("True");
        return true;

    }

    public void removeChar(char ch) {

        StringBuilder newStrg = new StringBuilder(str);
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ch) {
                newStrg.deleteCharAt(i);
            }
        }
        System.out.println(newStrg);
    }

    boolean isPalindrome() {
        int n = str.length();
        for (int i = 0; i < (n/2); ++i) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                System.out.println("False");
                return false;
            }
        }
        System.out.println("True");
        return true;
    }

    public void duplicate(String s){
        if (s == str){
            String strTemp = str.toUpperCase();
            s = strTemp+strTemp;
            setStr(s);
        }
        else {
            setStr(s);
        }
    }





    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a new String");
        String str = input.nextLine();

        StringCompute s1 = new StringCompute(str);

        System.out.println("What letter would you like to check?");
        char ch = input.next().charAt(0);
        s1.countOccurances(ch);

        System.out.println("Does it have digits?");
        s1.hasOnlyDigits();

        System.out.println("Remove which letter?");
        ch = input.next().charAt(0);
        s1.removeChar(ch);

        System.out.println("Is your string a palindrome?");
        s1.isPalindrome();
    }





}
