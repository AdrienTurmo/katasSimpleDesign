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
    public void should_return_a_table_with_only_one_X_in_the_middle_of_the_board() throws Exception {
        Board board = new Board();

        board.put(Symbol.X,Position.MIDDLE);

        String[][] values = board.stringify();
        String[][] expectedValues = {
                {" ", " ", " "},
                {" ", "X", " "},
                {" ", " ", " "}
        };

        assertThat(values).isEqualTo(expectedValues);
    }

    @Test
    public void should_return_a_table_with_only_one_X_in_the_top_left_of_the_board() throws Exception {
        Board board = new Board();

        board.put(Symbol.X,Position.TOPLEFT);

        String[][] values = board.stringify();
        String[][] expectedValues = {
                {"X", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };

        assertThat(values).isEqualTo(expectedValues);
    }
}