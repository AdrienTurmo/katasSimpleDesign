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

    @Test
    public void first_player_plays_in_the_middle() throws Exception {
        ticTacToeGame.nextPlayAt(Position.MIDDLEMIDDLE);

        ticTacToeGame.printBoard(boardPrinter);

        InOrder inOrder = Mockito.inOrder(out);
        inOrder.verify(out).println(" | | ");
        inOrder.verify(out).println("-----");
        inOrder.verify(out).println(" |X| ");
        inOrder.verify(out).println("-----");
        inOrder.verify(out).println(" | | ");
    }

    @Test
    public void first_player_plays_in_the_top_left() throws Exception {
        ticTacToeGame.nextPlayAt(Position.TOPLEFT);

        ticTacToeGame.printBoard(boardPrinter);

        InOrder inOrder = Mockito.inOrder(out);
        inOrder.verify(out).println("X| | ");
        inOrder.verify(out).println("-----");
        inOrder.verify(out).println(" | | ");
        inOrder.verify(out).println("-----");
        inOrder.verify(out).println(" | | ");
    }

    @Test
    public void first_player_plays_X_in_the_top_left_and_the_second_player_plays_O_in_the_middle() throws Exception {
        ticTacToeGame.nextPlayAt(Position.TOPLEFT);
        ticTacToeGame.nextPlayAt(Position.MIDDLEMIDDLE);

        ticTacToeGame.printBoard(boardPrinter);

        InOrder inOrder = Mockito.inOrder(out);
        inOrder.verify(out).println("X| | ");
        inOrder.verify(out).println("-----");
        inOrder.verify(out).println(" |O| ");
        inOrder.verify(out).println("-----");
        inOrder.verify(out).println(" | | ");
    }

    @Test(expected = AlreadyFilledCaseError.class)
    public void if_plays_in_an_already_filled_cell_return_specific_error() throws Exception {
        ticTacToeGame.nextPlayAt(Position.TOPLEFT);
        ticTacToeGame.nextPlayAt(Position.MIDDLEMIDDLE);

        ticTacToeGame.printBoard(boardPrinter);
    }
}