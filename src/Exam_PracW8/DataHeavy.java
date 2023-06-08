package Exam_PracW8;

class DataHeavy extends MobileData {
    public DataHeavy(int talkLimit, int textLimit, int dataLimit) {
        super(talkLimit, textLimit, dataLimit);
    }

    @Override
    public void transfer(int n) {
        // No limit on data transfers
        this.nDataRecieved += n;
    }
}
