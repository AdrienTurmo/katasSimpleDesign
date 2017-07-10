package tictactoe;

public class TicTacToe {

    private Board board;

    public TicTacToe() {
        this.board = new Board();
    }

    public void printBoard(BoardPrinter printer) {
        printer.print(board);
    }

    public void nextPlayAt(Position position) {
        board.put(Symbol.X ,position);
    }
}
