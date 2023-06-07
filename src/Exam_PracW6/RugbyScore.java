package Exam_PracW6;

public class RugbyScore {

    private String teamName;
    private int teamScore;

    public RugbyScore(String teamName) {
        this.teamName = teamName;
        this.teamScore = 0;
    }

    public void score(ScoreAction action){
        for (int i = 0; i < ScoreAction.values().length; i++) {
            if (action == ScoreAction.values()[i]){
                int tempScore = ScoreAction.values()[i].getWorth();
                this.teamScore += tempScore;
            }
        }
    }

    @Override
    public String toString() {
        return "Team Name:" + teamName + " , Score: " + teamScore;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(int teamScore) {
        this.teamScore = teamScore;
    }

    public void incTeamScore(int teamScore) {
        this.teamScore += teamScore;
    }

    public static void main(String[] args)
    {
        RugbyScore blues = new RugbyScore("Blues");
        System.out.println("Before they score points: " + blues);
        blues.score(ScoreAction.TRY);
        System.out.println("After they score a try: "+blues);
        blues.score(ScoreAction.DROPGOAL);
        System.out.println("After they score a dropgoal: " + blues);
    }
}
