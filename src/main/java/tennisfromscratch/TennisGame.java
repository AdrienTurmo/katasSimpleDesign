package tennisfromscratch;

import java.util.Objects;

public class TennisGame {

    String gameScore = "Love-All";

    public String printScore() {
        return gameScore;
    }

    public void playerOneScored() {
        if (Objects.equals(gameScore, "Love-Fifty")) {
            gameScore = "Fifty-All";
        } else {
            gameScore = "Fifty-Love";
        }
    }

    public void playerTwoScored() {
        if (Objects.equals(gameScore, "Fifty-Love")) {
            gameScore = "Fifty-All";
        } else {
            gameScore = "Love-Fifty";
        }
    }
}
