package tennisfromscratch;

public class TennisGame {

    String gameScore = "Love-All";

    public String printScore() {
        return gameScore;
    }

    public void playerOneScored() {
        gameScore = "Fifty-Love";
    }

    public void playerTwoScored() {
        gameScore = "Love-Fifty";
    }
}
