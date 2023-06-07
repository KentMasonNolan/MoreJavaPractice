package Exam_PracW8;

import java.util.Scanner;

public class AnimalApplication {

    private static int animalCount = 0;

    public static void main(String[] args) {
        Animal[] animalList = new Animal[4];
        Scanner input = new Scanner(System.in);

        while (animalCount < animalList.length) {
            System.out.println("Please choose from the following options: ");
            System.out.println("1. Instantiate cat");
            System.out.println("2. Instantiate dog");
            System.out.println("3. Exit");

            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    animalList[animalCount] = new DomesticCat();
                    animalCount++;
                    break;
                case 2:
                    animalList[animalCount] = new Dog();
                    animalCount++;
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("Please choose a valid option.");
            }
        }

        while (true) {
            System.out.println("Please choose from the following options: ");
            System.out.println("1. List of animals available");
            System.out.println("2. Select animal to feed");
            System.out.println("3. Exit");

            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    for (int i = 0; i < animalList.length; i++) {
                        System.out.println((i + 1) + ": " + animalList[i]);
                    }
                    break;
                case 2:
                    System.out.println("Please select an Animal to feed: ");
                    for (int i = 0; i < animalList.length; i++) {
                        System.out.println((i + 1) + ": " + animalList[i]);
                    }
                    int userChoice = input.nextInt();
                    animalList[userChoice].feed();
                    System.out.println(animalList[userChoice]);
                    break;
                case 3:
                    System.exit(3);
            }
        }
    }
}
