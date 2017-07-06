package tennisfromscratch;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

@RunWith(Parameterized.class)
public class TennisGameTest {
    private TennisGame tennisGame;
    private Integer[] scoreSequence;
    private String expectedScore;

    @Before
    public void setUp() throws Exception {
        tennisGame = new TennisGame();
    }

    public TennisGameTest(Integer[] scoreSequence, String expectedScore) {
        this.scoreSequence = scoreSequence;
        this.expectedScore = expectedScore;
    }

    @Parameterized.Parameters
    public static Collection tennisGameSequence() {
        return Arrays.asList(new Object[][] {
                { new Integer[]{}, "Love-All" },

                { new Integer[]{1}, "Fifteen-Love" },
                { new Integer[]{1,1}, "Thirty-Love" },
                { new Integer[]{1,1,1}, "Forty-Love" },

                { new Integer[]{2}, "Love-Fifteen" },
                { new Integer[]{2,2}, "Love-Thirty" },
                { new Integer[]{2,2,2}, "Love-Forty" },

                { new Integer[]{1,2}, "Fifteen-All" },
                { new Integer[]{2,1}, "Fifteen-All" },

                { new Integer[]{1,1,2}, "Thirty-Fifteen" },
                { new Integer[]{1,2,1}, "Thirty-Fifteen" },

                { new Integer[]{2,2,1}, "Fifteen-Thirty" },
                { new Integer[]{2,1,2}, "Fifteen-Thirty" },
        });
    }

    public void checkAllSequence(TennisGame game) {
        for (int whoScored : scoreSequence) {
            switch (whoScored) {
                case 1 :
                    game.playerOneScored();
                    break;
                case 2 :
                    game.playerTwoScored();
                    break;
            }
        }
        assertThat(game.printScore()).isEqualTo(expectedScore);
    }

    @Test
    public void should_return_correct_score() throws Exception {
        checkAllSequence(tennisGame);
    }

}