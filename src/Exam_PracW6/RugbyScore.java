package Exam_PracW6;

public class RugbyScore {

    private String teamName;
    private int teamScore;

    public RugbyScore(String teamName) {
        this.teamName = teamName;
        this.teamScore = 0;
    }

    @Override
    public String toString() {
        return "RugbyScore{" + "teamName='" + teamName + '\'' + ", teamScore=" + teamScore + '}';
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
}
