package tictactoe;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class TicTacToeAcceptanceTest {

    @Mock
    private PrintStream out = System.out;

    private BoardPrinter boardPrinter;
    private TicTacToe ticTacToeGame;

    @Before
    public void setUp() throws Exception {
        boardPrinter = new ConsolePrinter(out::println);
        ticTacToeGame = new TicTacToe();
    }

    @Test
    public void should_print_empty_board() throws Exception {
        ticTacToeGame.printBoard(boardPrinter);

        InOrder inOrder = Mockito.inOrder(out);
        inOrder.verify(out).println(" | | ");
        inOrder.verify(out).println("-----");
        inOrder.verify(out).println(" | | ");
        inOrder.verify(out).println("-----");
        inOrder.verify(out).println(" | | ");
    }

}