package Exam_PracW8;

import java.util.Date;

public class MobileData extends Standard {

    protected int nDataRecieved;
    private final int nDataLimit;

    public MobileData(int nMinsTalked, int nTextSent, int nDataRecieved) {
        super(nMinsTalked, nTextSent);
        this.nDataRecieved = nDataRecieved;
        this.nDataLimit = 100;
    }

    @Override
    public double billing() {
        return (super.billing() + this.nDataRecieved*0.15);
    }

    public void transfer(int n) {
        if (this.nDataRecieved + n > this.nDataLimit) {
            System.out.println("You have no data remaining.");
        } else {
            this.nDataRecieved += nDataRecieved;
        }
    }
}
