package tennisfromscratch;

public enum TennisScore {
    WinPlayerOne("Player One Wins"),
    WinPlayerTwo("Player Two Wins"),
    ThirtyThirty("Thirty-All"),
    FortyFifteen("Forty-Fifteen",WinPlayerOne,WinPlayerOne),
    FifteenForty("Fifteen-Forty",WinPlayerTwo,WinPlayerTwo),
    FifteenThirty("Fifteen-Thirty",ThirtyThirty,FifteenForty),
    ThirtyFifteen("Thirty-Fifteen",FortyFifteen,ThirtyThirty),
    LoveForty("Love-Forty",FifteenForty,WinPlayerTwo),
    FortyLove("Forty-Love",WinPlayerOne,FortyFifteen),
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
