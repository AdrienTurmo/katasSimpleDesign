package tictactoe;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Line {

    public static final int NUMBER_OF_COLUMNS = 3;
    private Cell[] cells;

    public Line() {
        this.cells = new Cell[NUMBER_OF_COLUMNS];
        for (int index = 0; index < NUMBER_OF_COLUMNS; index++) {
            cells[index] = new Cell(" ");
        }
    }

    public String[] stringify() {
        String[] stringedCell = new String[NUMBER_OF_COLUMNS];
        for (int index = 0; index < NUMBER_OF_COLUMNS; index++){
            stringedCell[index] = cells[index].toString();
        }
        return  stringedCell;
    }

    public void put(Symbol symbol, int columnNumber) {
        cells[0] = new Cell(symbol.name());
    }
}
