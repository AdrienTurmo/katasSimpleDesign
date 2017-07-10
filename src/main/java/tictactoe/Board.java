package tictactoe;

public class Board {

    public static final int NUMBER_OF_LINES = 3;
    private Line[] lines;

    public Board() {
        this.lines = new Line[NUMBER_OF_LINES];
        for (int index = 0; index < NUMBER_OF_LINES; index++) {
            lines[index] = new Line();
        }
    }

    public String[][] stringify() {
        String[][] stringedLines =  new String[NUMBER_OF_LINES][];
        for (int index = 0; index < NUMBER_OF_LINES; index++) {
            stringedLines[index] = lines[index].stringify();
        }
        return  stringedLines;
    }

    public void put(Symbol symbol, Position position) {
        lines[position.getLineNumber()].put(symbol,position.getLineNumber());
    }
}
