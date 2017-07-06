package tennisfromscratch;

import static tennisfromscratch.TennisScore.*;

public class TennisGame {

    TennisScore gameScore = LoveAll;

    public String printScore() {
        return gameScore.toString();
    }

    public void playerOneScored() {

        if (gameScore == LoveFifteen) {
            gameScore = FifteenAll;
        } else if (gameScore == FifteenLove) {
            gameScore = ThirtyLove;
        } else {
            gameScore = FifteenLove;
        }
    }

    public void playerTwoScored() {
        if (gameScore == FifteenLove) {
            gameScore = FifteenAll;
        } else {
            gameScore = LoveFifteen;
        }
    }
}
