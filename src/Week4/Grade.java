package Week4;

public class Grade {
    private int percentage;//a value in the range 0..100.

    public Grade(int percentage) {
        this.setPercentage(percentage);
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public int getPercentage() {
        return this.percentage;
    }
}


