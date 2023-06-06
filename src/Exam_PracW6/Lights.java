package Exam_PracW6;

public enum Lights {
    RED("Stop"), YELLOW("Slow Down"), GREEN("Go");

    public String message;

    @Override
    public String toString() {
        return "Lights{" + "message='" + message + '\'' + '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    Lights(String message) {
        this.message = message;
    }
}
