package Test;

public class asdasd Books: public class Books {
    private String title;
    private String author;
    private boolean borrowed;
    public Books(String title, String author, boolean borrowed) {
        this.title = title;
        this.author = author;
        this.borrowed = borrowed;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public boolean getBorrowed() {
        return borrowed;
    }
    public void setBorrowed() {
        this.borrowed = borrowed;
        public String toString() {
            return this.getTitle() + "By:" + " " + this.getAuthor() + "is borrowed:" + " " + this.getBorrowed();
        }
    }{
}

    Dog: public class Dog {
        private String name;
        private int age;
        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String toString() {
            return "Name:" + " " + getName() + "," + " " + "Age:" + " " + (7 * getAge());
        }
    }

    Employee: import java.util.LinkedList;
import java.util.Queue;
    public class Employee implements Comparable < Employee > {
        private String name;public Integer idNumber;public Employee(String name, int idNumber) {
            this.name = name;
            this.idNumber = idNumber;
        }
        public String toString() {
            return this.name + ": " + idNumber;
        }
        @Override public int compareTo(Employee o) {
            return this.idNumber.compareTo(o.idNumber);
        }
        public static void main(String args[]) {
            Queue < Employee > queue = newLinkedList < Employee > ();
            queue.add(new Employee("Carl", 2));
            queue.add(new Employee("Alice", 1));
            queue.add(new Employee("Bob", 3));
            queue.add(new Employee("Danny", 4));
            System.out.println(queue.peek());
            System.out.println(queue.remove());
            System.out.println(queue.remove());
            System.out.println(queue.remove());
            System.out.println(queue.peek());
            System.out.println(queue.remove());
        }
    }

    Flight: public class Flight {
        private String airCode;
        private String name;
        private String origin;
        private String destination;
        public Flight(String airCode, String name, String origin, String destination) {
            this.airCode = airCode;
            this.name = name;
            this.origin = origin;
            this.destination = destination;
        }
        public String getAirCode() {
            return airCode;
        }
        public void setAirCode(String airCode) {
            this.airCode = airCode;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getOrigin() {
            return origin;
        }
        public void setOrigin(String origin) {
            this.origin = origin;
        }
        public String getDestination() {
            return destination;
        }
        public void setDestination(String destination) {
            this.destination = destination;
        }
        @Override public String toString() {
            return "Flight [AirCode=" + airCode + ", Name=" + name + ", Origin=" + origin + ", Destination=" + destination + "]";
        }
    }

    Sphere: public class Sphere {
        private static final double Math_PI = 0;
        private double diameter;
        public Sphere(double diameter) {
            this.diameter = diameter;
        }
        public double getDiameter() {
            return diameter;
        }
        public void setDiameter(double diameter) {
            this.diameter = diameter;
        }
        public double CalculateVolume() {
            double volume = (4.0 / 3.0) * Math_PI * Math.pow(this.diameter / 2, 3);
            return volume;
        }
        public double SurfaceArea() {
            double SA = 4 * Math_PI * Math.pow(this.diameter / 2, 2);
            return SA;
        }
    }
    Sphere App: public class SphereApp {
        public static void main(String[] args) {
            Sphere s1 = new Sphere(23.5);
            Sphere s2 = new Sphere(15.87);
            Sphere s3 = new Sphere(12.4);
            System.out.println(s1.CalculateVolume());
            System.out.println(s2.CalculateVolume());
            System.out.println(s3.CalculateVolume());
        }
    }