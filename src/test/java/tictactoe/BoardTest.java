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

    @Test
    public void should_return_a_table_with_only_one_X_in_the_top_middle_of_the_board() throws Exception {
        Board board = new Board();

        board.put(Symbol.X,Position.TOPMIDDLE);

        String[][] values = board.stringify();
        String[][] expectedValues = {
                {" ", "X", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };

        assertThat(values).isEqualTo(expectedValues);
    }

    @Test
    public void should_return_a_table_with_only_one_X_in_the_top_right_of_the_board() throws Exception {
        Board board = new Board();

        board.put(Symbol.X,Position.TOPRIGHT);

        String[][] values = board.stringify();
        String[][] expectedValues = {
                {" ", " ", "X"},
                {" ", " ", " "},
                {" ", " ", " "}
        };

        assertThat(values).isEqualTo(expectedValues);
    }

    @Test
    public void should_return_a_table_with_only_one_X_in_the_middle_left_of_the_board() throws Exception {
        Board board = new Board();

        board.put(Symbol.X,Position.MIDDLELEFT);

        String[][] values = board.stringify();
        String[][] expectedValues = {
                {" ", " ", " "},
                {"X", " ", " "},
                {" ", " ", " "}
        };

        assertThat(values).isEqualTo(expectedValues);
    }

    @Test
    public void should_return_a_table_with_only_one_X_in_the_middle_of_the_board() throws Exception {
        Board board = new Board();

        board.put(Symbol.X,Position.MIDDLEMIDDLE);

        String[][] values = board.stringify();
        String[][] expectedValues = {
                {" ", " ", " "},
                {" ", "X", " "},
                {" ", " ", " "}
        };

        assertThat(values).isEqualTo(expectedValues);
    }

    @Test
    public void should_return_a_table_with_only_one_X_in_the_middle_right_of_the_board() throws Exception {
        Board board = new Board();

        board.put(Symbol.X,Position.MIDDLERIGHT);

        String[][] values = board.stringify();
        String[][] expectedValues = {
                {" ", " ", " "},
                {" ", " ", "X"},
                {" ", " ", " "}
        };

        assertThat(values).isEqualTo(expectedValues);
    }

    @Test
    public void should_return_a_table_with_only_one_X_in_the_bottom_left_of_the_board() throws Exception {
        Board board = new Board();

        board.put(Symbol.X,Position.BOTTOMLEFT);

        String[][] values = board.stringify();
        String[][] expectedValues = {
                {" ", " ", " "},
                {" ", " ", " "},
                {"X", " ", " "}
        };

        assertThat(values).isEqualTo(expectedValues);
    }

    @Test
    public void should_return_a_table_with_only_one_X_in_the_bottom_middle_of_the_board() throws Exception {
        Board board = new Board();

        board.put(Symbol.X,Position.BOTTOMMIDDLE);

        String[][] values = board.stringify();
        String[][] expectedValues = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", "X", " "}
        };

        assertThat(values).isEqualTo(expectedValues);
    }

    @Test
    public void should_return_a_table_with_only_one_X_in_the_bottom_right_of_the_board() throws Exception {
        Board board = new Board();

        board.put(Symbol.X,Position.BOTTOMRIGHT);

        String[][] values = board.stringify();
        String[][] expectedValues = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", "X"}
        };

        assertThat(values).isEqualTo(expectedValues);
    }

    @Test
    public void should_return_a_table_with_only_one_O_in_the_bottom_right_of_the_board() throws Exception {
        Board board = new Board();

        board.put(Symbol.O,Position.MIDDLEMIDDLE);

        String[][] values = board.stringify();
        String[][] expectedValues = {
                {" ", " ", " "},
                {" ", "O", " "},
                {" ", " ", " "}
        };

        assertThat(values).isEqualTo(expectedValues);
    }

    @Test
    public void should_return_that_the_board_is_not_filled() throws Exception {
        Board board = new Board();

        board.put(Symbol.O,Position.MIDDLEMIDDLE);
        board.put(Symbol.O,Position.BOTTOMMIDDLE);

        assertThat(board.isFilled()).isFalse();
    }
}