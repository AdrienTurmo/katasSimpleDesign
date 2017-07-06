package tennisfromscratch;

public enum TennisScore {
    ThirtyLove("Thirty-Love"),
    FifteenAll("Fifteen-All"),
    FifteenLove("Fifteen-Love",ThirtyLove),
    LoveFifteen("Love-Fifteen",FifteenAll),
    LoveAll("Love-All",FifteenLove);

    private String name;
    private TennisScore nextScoreIfPlayerOneScore;

    TennisScore(String name, TennisScore score) {
        this.name = name;
        this.nextScoreIfPlayerOneScore = score;
    }

    TennisScore(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public TennisScore playerOneScored() {
        return nextScoreIfPlayerOneScore;
    }
}
