package Exam_PracW9;

import java.util.ArrayList;

public class NumberList {

    private ArrayList<Integer> list;

    public NumberList(String input) {
        list = new ArrayList<>();
        if (!input.isEmpty()) {
            String[] numberString = input.split(" ");
            for (String numberStrings : numberString) {
                int number = Integer.valueOf(numberStrings);
                list.add(number);
            }
        }
    }

    public NumberList(ArrayList<Integer> numberInput) {
        this.list = numberInput;
    }

    public ArrayList<Integer> getNumbers() {
        return list;
    }

    public int sum() {
        int total = 0;
        for (Integer lists : list) {
            total += lists;
        }
        return total;
    }

    public double average() {
        int total = this.sum();
        return ((double) total / (double) list.size());
    }


}
