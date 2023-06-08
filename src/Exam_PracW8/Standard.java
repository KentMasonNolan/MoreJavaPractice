package Exam_PracW8;

public class Standard {

    private int nMinsTalked;
    private int nMinsLimit;
    private int nTextLimit;
    private int nTextSent;

    public Standard(int nMinsTalked, int nTextSent) {
        this.nMinsTalked = nMinsTalked;
        this.nMinsLimit = 100;

        this.nTextSent = nTextSent;
        this.nTextLimit = 100;

    }

    public void talk(int nMinsTalked) {
        if (this.nMinsTalked + nMinsTalked > this.nMinsLimit) {
            System.out.println("You have no minutes remaining.");
        } else {
            this.nMinsTalked += nMinsTalked;
        }
    }
    public void text(int nTextSent) {
        if (this.nTextSent + nTextSent > nTextLimit) {
            System.out.println("You have no texts remaining.");

        } else {
            this.nTextSent += nTextSent;
        }
    }


}
