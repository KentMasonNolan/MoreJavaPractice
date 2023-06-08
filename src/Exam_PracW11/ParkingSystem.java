package Exam_PracW11;

import java.util.Arrays;

public class ParkingSystem {

    public int[] smallSpaces;
    public int[] mediumSpaces;
    public int[] bigSpaces;

//    public ParkingSystem p1;


    public ParkingSystem(int smallSpaces, int mediumSpaces, int bigSpaces) {
        this.smallSpaces = new int[smallSpaces];
        this.mediumSpaces = new int[mediumSpaces];
        this.bigSpaces = new int[bigSpaces];
    }

    public int[] getSmallSpaces() {
        return smallSpaces;
    }

    public int[] getMediumSpaces() {
        return mediumSpaces;
    }

    public int[] getBigSpaces() {
        return bigSpaces;
    }

    public boolean addCar(int carType){

        switch (carType){
            case 1: //adding big car
                for (int i = 0; i < bigSpaces.length; i++) {
                    if (this.bigSpaces[i] == 0) {
                        System.out.println("Thank you, you car is parked in slot: " + (i));
                        this.bigSpaces[i] = 1;
                        return true;
                    }
                }
                System.out.println("Sorry, carpark is full");
                return false;

            case 2: //adding medium car
                for (int i = 0; i < mediumSpaces.length; i++) {
                    if (this.mediumSpaces[i] == 0){
                        System.out.println("Thank you, you car is parked in slot: " + (i));
                        this.mediumSpaces[i] = 1;
                        return true;
                    }
                }
                System.out.println("Sorry, carpark is full");
                return false;

            case 3: //adding medium car
                for (int i = 0; i < smallSpaces.length; i++) {
                    if (this.smallSpaces[i] == 0){
                        System.out.println("Thank you, you car is parked in slot: " + (i));
                        this.smallSpaces[i] = 1;
                        return true;
                    }
                }
                System.out.println("Sorry, carpark is full");
                return false;

            default:
                System.out.println("Please pick a valid option: 1, 2 or 3");
                break;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ParkingSystem{" + "smallSpaces=" + Arrays.toString(smallSpaces) + ", mediumSpaces=" + Arrays.toString(mediumSpaces) + ", bigSpaces=" + Arrays.toString(bigSpaces) + '}';
    }

    public static void main(String[] args) {
        ParkingSystem p1 = new ParkingSystem(15,12,10);

       System.out.println( p1.addCar(2));

       ParkingSystem p2 = new ParkingSystem(1,1,1);

       p2.addCar(1);
       p2.addCar(1);
        System.out.println(p2);

    }
}
