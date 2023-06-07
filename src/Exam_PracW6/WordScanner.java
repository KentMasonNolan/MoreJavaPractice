package Exam_PracW6;

import java.util.Scanner;

public class WordScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This is where you would input a bunch of words. For this example I am going to pre-make the userInput message as the following: ");
        System.out.println("The quick brown fox jumps brown fox jumps brown fox jumps over the lazy dog");
        String userInput = "The quick brown fox jumps brown fox jumps brown fox jumps over the lazy dog";

        String[] arrayUserInput = userInput.split(" ");
        for (int i = 0; i < arrayUserInput.length; i++) {
            for (int j = 0; j < Words.values().length; j++) {
                if (arrayUserInput[i].equalsIgnoreCase(Words.values()[j].name())){
                    Words.values()[j].incCount();
                }
            }
        }
        for (Words word: Words.values()){
            System.out.println(word.name() + ": " + word.getCount());
        }
    }
}
