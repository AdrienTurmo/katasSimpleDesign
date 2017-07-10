package tictactoe;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CellTest {

    @Test
    public void should_create_an_empty_cell() throws Exception {
        Cell cell = new Cell();
        assertThat(cell.toString()).isEqualTo(" ");
    }

    @Test
    public void should_fill_a_cell_with_X() throws Exception {
        Cell cell = new Cell();
        cell.put(Symbol.X);
        assertThat(cell.toString()).isEqualTo("X");
    }

    @Test
    public void should_fill_a_cell_with_O() throws Exception {
        Cell cell = new Cell();
        cell.put(Symbol.O);
        assertThat(cell.toString()).isEqualTo("O");
    }

    @Test(expected = AlreadyFilledCaseError.class)
    public void should_return_an_error_if_trying_to_fill_an_not_empty_cell() throws Exception {
        Cell cell = new Cell();
        cell.put(Symbol.X);
        cell.put(Symbol.X);
    }

    @Test
    public void should_be_empty() throws Exception {
        Cell cell = new Cell();
        assertFalse(cell.isFilled());
    }

    @Test
    public void should_be_filled() throws Exception {
        Cell cell = new Cell();
        cell.put(Symbol.X);
        assertTrue(cell.isFilled());
    }
}