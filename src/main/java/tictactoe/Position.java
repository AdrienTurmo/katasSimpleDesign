package tictactoe;

public enum Position {
    MIDDLE(1, 1),
    TOPLEFT(0, 0);


    private int lineNumber;
    private int columnNumber;

    Position(int lineNumber, int columnNumber) {
        this.lineNumber = lineNumber;
        this.columnNumber = columnNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }
}
