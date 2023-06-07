/***
 *

 * Student Name: Kent Nolan

 * Student ID: 20119784

 * Course Code: COMP503 - Programing 2

 * Assessment Item: Week 5 lab

 *
 **/

package Week5;

import java.util.Random;

public class NumberList {

    private int arr[];

    NumberList(){
        arr = new int[10];
    }

    NumberList(int r){

        arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int random_num = random.nextInt(r-1);
            arr[i] = random_num;
        }
    }

    public int size(){
        return arr.length;
    }

    public String toString(){
        String s = "";
        for (int i = 0; i < 10; i++) {
            s += arr[i];
            i++;
        }
        return s;
    }

    private boolean valid(int i){
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == i){
                return true;
            }
        }
        return false;
    }

    public void update(int index, int value){
        arr[index] = value;
    }

    public int min(){
        int min = 99;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        return min;
    }
    public int max(){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int nonZero(){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                count++;
            }
        }
        return count;
    }

    public double average(){

        double total = 0;
        double average = 0.0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        average = total/ arr.length;
        return average;
    }

    public int getNumber(int i){
        return arr[i];
    }

    public void absolute()

    {
        for(int i = 0; i < arr.length; i++)
        {
            int term = arr[i];
            if( term < 0)
                arr[i] = (int)Math.abs(term);
        }
    }
    
    public void scale(int f){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*f;
        }
    }

    public NumberList sub(int startindex, int endindex)
    {
        NumberList new_num_list = new NumberList();
        for(int i = startindex ; i <= endindex; i++)
        {
            new_num_list.arr[i] = this.arr[i];
        }
        return new_num_list;
    }

    public String frequencies(int[] input){
        int[] count = new int[10];
        for (int item : input){
            count[item]++;
        }
        String output = "";

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0){
                output += (i) + ": Has the frequency " + count[i] + "\n";
            }
        }
        return output;
    }

    public char[] underScore(String input, int p){

        char[] output = new char[input.length()*(p+1)];
        String[] stringArray = input.strip().split("");
        int position = 0;

        for (int i = 0; i < output.length; i++) {
            output[i] = input.charAt(position);
            position++;
            for (int j = 1; j < p+1; j++) {
                output[i+j] = '_';
            }i+=p;
        }
        return output;
    }




    public static void main(String[] args) {

        System.out.println("test");

        }
    }

