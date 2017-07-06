package tennisfromscratch;

import java.util.Objects;

import static tennisfromscratch.TennisScore.*;

public class TennisGame {

    TennisScore gameScore = LoveAll;

    public String printScore() {
        return gameScore.toString();
    }

    public void playerOneScored() {

        if (gameScore == LoveFifty) {
            gameScore = FiftyAll;
        } else {
            gameScore = FiftyLove;
        }
    }

    public void playerTwoScored() {
        if (gameScore == FiftyLove) {
            gameScore = FiftyAll;
        } else {
            gameScore = LoveFifty;
        }
    }
}
