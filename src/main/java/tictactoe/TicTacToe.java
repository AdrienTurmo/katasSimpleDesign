package tictactoe;

public class TicTacToe {

    private Board board;
    private Symbol currentSymbol;

    public TicTacToe() {
        this.board = new Board();
        this.currentSymbol = Symbol.X;
    }

    public void printBoard(BoardPrinter printer) {
        printer.print(board);
    }

    public void nextPlayAt(Position position) {
        try {
            board.put(currentSymbol,position);
        } catch (AlreadyFilledCaseError alreadyFilledCaseError) {
            alreadyFilledCaseError.printStackTrace();
            currentSymbol = currentSymbol.changeToTheOther();
        }
    }
}
