package tennisfromscratch;

import static tennisfromscratch.TennisScore.*;

public class TennisGame {

    TennisScore gameScore = LoveAll;

    public String printScore() {
        return gameScore.toString();
    }

    public void playerOneScored() {
        gameScore = gameScore.playerOneScored();
    }

    public void playerTwoScored() {
        gameScore = gameScore.playerTwoScored();
    }
}
