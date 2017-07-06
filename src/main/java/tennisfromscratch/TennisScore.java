package tennisfromscratch;

public enum TennisScore {
    LoveThirty("Love-Thirty"),
    ThirtyLove("Thirty-Love"),
    FifteenAll("Fifteen-All"),
    FifteenLove("Fifteen-Love",ThirtyLove, FifteenAll),
    LoveFifteen("Love-Fifteen",FifteenAll, LoveThirty),
    LoveAll("Love-All",FifteenLove, LoveFifteen);

    private String name;
    private TennisScore nextScoreIfPlayerOneScore;
    private TennisScore nextScoreIfPlayerTwoScore;

    TennisScore(String name, TennisScore nextScoreIfPlayerOneScore, TennisScore nextScoreIfPlayerTwoScore) {
        this.name = name;
        this.nextScoreIfPlayerOneScore = nextScoreIfPlayerOneScore;
        this.nextScoreIfPlayerTwoScore = nextScoreIfPlayerTwoScore;
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

    public TennisScore playerTwoScored() {
        return nextScoreIfPlayerTwoScore;
    }
}
