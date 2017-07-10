package tictactoe;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {

    @Test
    public void should_return_a_table_of_empty_values_in_the_board() throws Exception {
        Board board = new Board();

        String[][] values = board.stringify();
        String[][] expectedValues = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };

        assertThat(values).isEqualTo(expectedValues);
    }

    @Test
    public void should_return_a_table_of_the_value_in_the_board() throws Exception {
        Board board = new Board();

        String[][] values = board.stringify();
        String[][] expectedValues = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };

        assertThat(values).isEqualTo(expectedValues);
    }
}