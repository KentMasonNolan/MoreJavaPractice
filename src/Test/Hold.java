package Test;

public class Hold {
}
    Flight Test: public class FlightTest {
    public static void main(String[] args) {
        Flight f1 = new Flight("SIN1202", "Singapore Airlines", "Auckland", "Singapore");
        Flight f2 = new Flight("EMI2910", "Emirate Airlines", "Dubai", "Wellington");
        Flight f3 = new Flight("NZA3456", "Air New Zealand Airlines", "Christchurch", "Queenstown");
        Flight f4 = new Flight("THA7861", "Thai Airlines", "Bangkok", "Macau");
        Flight f5 = new Flight("IND4208", "Air India Airlines", "Delhi", "Chennai");
        Flight f6 = new Flight("MAL0077", "Malaysian Airlines", "Kuala Lumpar", "Los Angeles");
        System.out.println("Show information of flights:");
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
        System.out.println(f4.toString());
        System.out.println(f5.toString());
        System.out.println(f6.toString());
    }
}
Kennel: public class Kennel {
    public static void main(String[] args) {
        Dog d1 = new Dog("Tom", 1);
        Dog d2 = new Dog("Jerry", 2);
        Dog d3 = new Dog("Tuffy", 3);
        Dog d4 = new Dog("Bandit", 4);
        Dog d5 = new Dog("Boxer", 5);
        Dog d6 = new Dog("ScoobyDoo", 6);
        Dog d7 = new Dog("Beethoven", 7);
        Dog d8 = new Dog("Bro", 8);
        Dog d9 = new Dog("Rocky", 9);
        Dog d10 = new Dog("Duke", 10);
        System.out.println("Show information of dogs:");
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println(d4.toString());
        System.out.println(d5.toString());
        System.out.println(d6.toString());
        System.out.println(d7.toString());
        System.out.println(d8.toString());
        System.out.println(d9.toString());
        System.out.println(d10.toString());
    }
}