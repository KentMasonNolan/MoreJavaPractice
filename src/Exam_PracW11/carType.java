package Exam_PracW11;

public enum carType {
    BIG(10), MEDIUM(12), SMALL(15);

    public static int spaces;

    carType(int spacesAvailable) {

    }

    public static int getSpaces() {
        return spaces;
    }

    public static void setSpaces(int spaces) {
        carType.spaces = spaces;
    }
}
