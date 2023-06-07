package Exam_PracW6;

public enum ScoreAction {
    TRY(5), CONVERSIONKICK(2), PENALTYKICK(3), DROPGOAL(3);
        private int points;


    ScoreAction(int points) {
        this.points = points;
    }


}
