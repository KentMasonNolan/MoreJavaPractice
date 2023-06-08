package Exam_PracW8;


public class Standard {

    protected int nMinsTalked;
    private final int nMinsLimit;
    private final int nTextLimit;
    protected int nTextSent;

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

    public double billing(){
        double output = 0.0;
        output += this.nMinsTalked * 0.1;
        output += this.nTextSent * 0.05;
        return output;
    }

}
