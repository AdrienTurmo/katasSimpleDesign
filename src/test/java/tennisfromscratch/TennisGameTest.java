package tennisfromscratch;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TennisGameTest {

    @Test
    public void should_return_Love_all_at_the_start_of_the_game() throws Exception {
        String score = TennisGame.printScore();

        assertThat(score).isEqualTo("Love-All");
    }
}