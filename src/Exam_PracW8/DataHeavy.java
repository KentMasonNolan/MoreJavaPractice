package Exam_PracW8;

public class DataHeavy extends MobileData{
    public DataHeavy(int nMinsTalked, int nTextSent, int nDataRecieved) {
        super(nMinsTalked, nTextSent, nDataRecieved);
    }

    @Override public void transfer(int n) {
        this.nDataRecieved += n;
    }
}
