package tennisfromscratch;

public enum TennisScore {
    WinPlayerOne("Player One Wins"),
    WinPlayerTwo("Player Two Wins"),
    AdvantagePlayerOne("Advantage Player One"),
    AdvantagePlayerTwo("Advantage Player Two"),
    FortyForty("Forty-All",AdvantagePlayerOne,AdvantagePlayerTwo),
    FortyThirty("Forty-Thirty",WinPlayerOne,FortyForty),
    ThirtyForty("Thirty-Forty",FortyForty,WinPlayerTwo),
    ThirtyThirty("Thirty-All",FortyThirty,ThirtyForty),
    FortyFifteen("Forty-Fifteen",WinPlayerOne,FortyThirty),
    FifteenForty("Fifteen-Forty",ThirtyForty,WinPlayerTwo),
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
