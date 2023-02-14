import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String world = new String("Hello World!");
        System.out.println(world);

        int x;
        x = 5;
        System.out.println(x);

        Scanner scanner = new Scanner(System.in);
        String y = scanner.nextLine();
        System.out.println(y);
        int h = scanner.nextInt();
        System.out.println(h);
        int g = h + x;
        System.out.println(g);
    }
}