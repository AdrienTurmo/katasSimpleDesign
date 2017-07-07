package tictactoe;

public class Cell {

    private String content = " ";

    public Cell(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}
