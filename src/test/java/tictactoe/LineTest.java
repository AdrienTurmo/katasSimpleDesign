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

}