package Exam_PracW4;


import java.util.Random;

public class NumberList {

    private int[] numbers;

    public NumberList() {
        numbers = new int[10];
    }

    public NumberList(int r) {
        numbers = new int[10]; // Initialize the array with 10 elements
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(r); // Generate random numbers between 0 and r-1
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < 10; i++) {
            s += numbers[i];
            s += " ";

        }
        return s;
    }

    public int size() {
        return numbers.length;
    }

    public boolean isValid(int i) {
        for (int number : numbers) {
            if (number == i) {
                return true;
            }
        }
        return false;
    }

    public void update(int i, int value) {
        if (!isValid(i)) {
            return;
        }
        for (int number : numbers) {
            if (numbers[number] == i) {
                numbers[number] = value;
            }
        }
    }

    public int min() {
        int min = 99;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public int max() {
        int max = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public int nonZero(){
        int zeros = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0){
                zeros ++;
            }
        }
        return zeros;
    }

    public double average(){
        double average = 0;

        for (int i = 0; i < numbers.length; i++) {
            average += numbers[i];
        }
        return average / numbers.length;
    }

    public int getNumber(int i){

        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == i){
                return j;
            }
        }
        return -1;
    }
}
