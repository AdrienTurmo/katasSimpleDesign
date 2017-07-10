package tictactoe;

public enum Position {
    TOPLEFT(0, 0), TOPMIDDLE(0, 1), TOPRIGHT(0, 2),
    MIDDLELEFT(1, 0), MIDDLEMIDDLE(1, 1), MIDDLERIGHT(1, 2),
    BOTTOMLEFT(2, 0), BOTTOMMIDDLE(2, 1), BOTTOMRIGHT(2, 2);


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
