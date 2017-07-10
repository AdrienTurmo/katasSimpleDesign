package tictactoe;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CellTest {

    @Test
    public void should_create_an_empty_cell() throws Exception {
        Cell cell = new Cell();
        assertThat(cell.toString()).isEqualTo(" ");
    }

    @Test
    public void should_fill_a_cell_with_X() throws Exception, AlreadyFilledCaseError {
        Cell cell = new Cell();
        cell.put(Symbol.X);
        assertThat(cell.toString()).isEqualTo("X");
    }

    @Test
    public void should_fill_a_cell_with_O() throws Exception, AlreadyFilledCaseError {
        Cell cell = new Cell();
        cell.put(Symbol.O);
        assertThat(cell.toString()).isEqualTo("O");
    }

    @Test(expected = AlreadyFilledCaseError.class)
    public void should_return_an_error_if_trying_to_fill_an_not_empty_cell() throws Exception, AlreadyFilledCaseError {
        Cell cell = new Cell();
        cell.put(Symbol.X);
        cell.put(Symbol.X);
    }
}