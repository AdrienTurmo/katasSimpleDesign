package tennisfromscratch;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisGameTest {

    TennisGame tennisGame;

    @Before
    public void setUp() throws Exception {
        tennisGame = new TennisGame();
    }

    @Test
    public void should_return_Love_all_at_the_start_of_the_game() throws Exception {
        String score = tennisGame.printScore();

        assertThat(score).isEqualTo("Love-All");
    }

    @Test
    public void should_return_15_0_if_player1_scored() throws Exception {
        tennisGame.playerOneScored();

        String score = tennisGame.printScore();

        assertThat(score).isEqualTo("Fifty-Love");
    }


    @Test
    public void should_return_0_15_if_player1_scored() throws Exception {
        tennisGame.playerTwoScored();

        String score = tennisGame.printScore();

        assertThat(score).isEqualTo("Love-Fifty");
    }


    @Test
    public void should_return_15_All_if_player1_scoredthen_player2() throws Exception {
        tennisGame.playerOneScored();
        tennisGame.playerTwoScored();

        String score = tennisGame.printScore();

        assertThat(score).isEqualTo("Fifty-All");
    }
}