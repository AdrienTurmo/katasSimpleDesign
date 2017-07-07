package tictactoe;

public class Board {

    private Line[] lines;

    public Board() {
        this.lines = new Line[3];
        for (int index = 0; index < 3; index++) {
            lines[index] = new Line();
        }
    }

    public String[][] stringify() {
        String[][] stringedLines =  new String[3][];
        for (int index = 0; index < 3; index++) {
            stringedLines[index] = lines[index].stringify();
        }
        return  stringedLines;
    }
}
