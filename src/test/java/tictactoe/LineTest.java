package tictactoe;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {

    @Test
    public void should_return_a_table_of_the_value_in_the_board() throws Exception {
        Line line = new Line();

        String[] values = line.stringify();
        String[] expectedValues = {" ", " ", " "};

        assertThat(values).isEqualTo(expectedValues);
    }

    @Test
    public void should_put_X_in_the_left_cell() throws Exception {
        Line line = new Line();

        line.put(Symbol.X,0);

        String[] values = line.stringify();
        String[] expectedValues = {"X", " ", " "};

        assertThat(values).isEqualTo(expectedValues);
    }

    @Test
    public void should_put_X_in_the_middle_cell() throws Exception {
        Line line = new Line();

        line.put(Symbol.X,1);

        String[] values = line.stringify();
        String[] expectedValues = {" ", "X", " "};

        assertThat(values).isEqualTo(expectedValues);
    }

    @Test
    public void should_put_X_in_the_right_cell() throws Exception {
        Line line = new Line();

        line.put(Symbol.X,2);

        String[] values = line.stringify();
        String[] expectedValues = {" ", " ", "X"};

        assertThat(values).isEqualTo(expectedValues);
    }

    @Test
    public void should_put_O_in_the_right_cell() throws Exception {
        Line line = new Line();

        line.put(Symbol.O,2);

        String[] values = line.stringify();
        String[] expectedValues = {" ", " ", "O"};

        assertThat(values).isEqualTo(expectedValues);
    }

    @Test
    public void isFilled_should_return_false_if_a_cell_is_empty() throws Exception {
        Line line = new Line();

        line.put(Symbol.O,0);
        line.put(Symbol.O,2);

        assertThat(line.isFilled()).isFalse();
    }

    @Test
    public void isFilled_should_return_true_if_all_cells_are_filled() throws Exception {
        Line line = new Line();

        line.put(Symbol.O,0);
        line.put(Symbol.O,1);
        line.put(Symbol.O,2);

        assertThat(line.isFilled()).isTrue();
    }
}