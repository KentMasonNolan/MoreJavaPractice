package Week8;

import java.util.Scanner;

public class AnimalApplication extends Animal{

    static Animal[] animals = new Animal[4];
    static int animalCount = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Pet Shop");

        while (animalCount<4){

            System.out.println("\nPlease choose from the following options");
            System.out.println("1. Cat");
            System.out.println("2. Dog\n");

            int userChoice = input.nextInt();

            switch (userChoice){
                case 1:
                    if (animalCount < animals.length){
                        animals[animalCount] = new Cat();
                        animalCount++;
                        break;
                    }

            case 2:
                if (animalCount < animals.length){
                    animals[animalCount] = new Dog();
                    animalCount++;
                    break;
                }
            default:
                System.out.println("Please choose a valid option");
                break;
            }

        }


        while (true){
            System.out.println("Select an animal to feed by entering a number within the range: 0 to 4");

            for (int i = 0; i < animalCount; i++) {
                System.out.println((i +1) +": " + animals[i]);
            }
            System.out.println("Or 0 to exit.");

            int userChoice = input.nextInt();

            if (userChoice>0 && userChoice<=animalCount){
                animals[userChoice-1].feed();
            } else if (userChoice==0) {
                System.exit(0);
            }
            else {
                System.out.println("Please choose a valid option.");
            }

        }

    }

}


