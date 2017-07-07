package tictactoe;

public class Line {

    private Cell[] cells;

    public Line() {
        this.cells = new Cell[3];
        for (int index = 0; index < 3; index++) {
            cells[index] = new Cell(" ");
        }
    }

    public String[] stringify() {
        String[] stringedCell = new String[3];
        for (int index = 0; index < 3; index++){
            stringedCell[index] = cells[index].toString();
        }
        return  stringedCell;
    }
}
