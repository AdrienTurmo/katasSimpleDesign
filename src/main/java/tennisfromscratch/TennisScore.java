package tennisfromscratch;

public enum TennisScore {
    WinPlayerOne("Player One Wins"),
    WinPlayerTwo("Player Two Wins"),
    FifteenThirty("Fifteen-Thirty"),
    ThirtyFifteen("Thirty-Fifteen"),
    LoveForty("Love-Forty",WinPlayerTwo,WinPlayerTwo),
    FortyLove("Forty-Love",WinPlayerOne,WinPlayerOne),
    LoveThirty("Love-Thirty", FifteenThirty, LoveForty),
    ThirtyLove("Thirty-Love", FortyLove, ThirtyFifteen),
    FifteenAll("Fifteen-All", ThirtyFifteen, FifteenThirty),
    FifteenLove("Fifteen-Love", ThirtyLove, FifteenAll),
    LoveFifteen("Love-Fifteen", FifteenAll, LoveThirty),
    LoveAll("Love-All", FifteenLove, LoveFifteen);

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
