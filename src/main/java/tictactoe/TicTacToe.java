package tictactoe;

public class TicTacToe {

    private Board board;

    public TicTacToe() {
        this.board = new Board();
    }

    public void printBoard(BoardPrinter printer) {
        printer.print(board);
    }

}
