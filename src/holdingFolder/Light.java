package holdingFolder;

import java.util.Scanner;

public class Light {
    private boolean power;
    public Light(boolean power) {
        this.power = false;
    }
    public boolean getPower() {
        return power;
    }
    public void setPower(boolean power) {
        this.power = power;
    }
    public void Switch() {
        this.power = !power;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Light abulb1 = new Light(false);
        Light abulb2 = new Light(true);
        abulb1.Switch();
        System.out.println("Bulb value is:" + abulb1.getPower());
        abulb1.setPower(true);
        abulb1.Switch();
        System.out.println("Bulb value 1 is :" + abulb1.getPower());
        abulb2.setPower(false);
        abulb2.Switch();
        System.out.println("Bulb value 2 is:" + abulb2.getPower());
    }
}
