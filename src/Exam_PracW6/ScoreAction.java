package Exam_PracW6;

public enum ScoreAction {
    TRY(5), CONVERSIONKICK(2), PENALTYKICK(3), DROPGOAL(3);
        private int worth;


    ScoreAction(int worth) {
        this.worth = worth;
    }

    public int getWorth() {
        return worth;
    }

    public void setWorth(int worth) {
        this.worth = worth;
    }

    public void ScoreAction(int worth){
        this.worth = worth;
    }

}
