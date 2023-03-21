package Week4;

public class BoxTest {

    public static void main(String[] args) {

        Box b1 = new Box(12,12,12);
        Box b2 = new Box(13, 13, 13);
        Box b3 = new Box(14, 14, 14);
        Box b4 = new Box(15, 15, 15);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        b1.fits(b2);
        b2.fits(b1);
    }
}