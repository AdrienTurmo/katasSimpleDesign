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

        assertThat(score).isEqualTo("Fifteen-Love");
    }


    @Test
    public void should_return_0_15_if_player1_scored() throws Exception {
        tennisGame.playerTwoScored();

        String score = tennisGame.printScore();

        assertThat(score).isEqualTo("Love-Fifteen");
    }

    @Test
    public void should_return_15_All_if_player1_scored_then_player2() throws Exception {
        tennisGame.playerOneScored();
        tennisGame.playerTwoScored();

        String score = tennisGame.printScore();

        assertThat(score).isEqualTo("Fifteen-All");
    }

    @Test
    public void should_return_15_All_if_player2_scored_then_player1() throws Exception {
        tennisGame.playerTwoScored();
        tennisGame.playerOneScored();

        String score = tennisGame.printScore();

        assertThat(score).isEqualTo("Fifteen-All");
    }

    @Test
    public void should_return_30_0_if_player1_scored_twice() throws Exception {
        tennisGame.playerOneScored();
        tennisGame.playerOneScored();

        String score = tennisGame.printScore();

        assertThat(score).isEqualTo("Thirty-Love");
    }
}