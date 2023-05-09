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

    }

}


