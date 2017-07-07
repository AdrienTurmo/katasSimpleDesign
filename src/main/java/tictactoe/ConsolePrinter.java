package tictactoe;

import java.util.function.Consumer;

public class ConsolePrinter implements BoardPrinter {

    public static final String COLUMN_SEPARATOR = "|";
    private Consumer<String> stringConsumer;

    public ConsolePrinter(Consumer<String> stringConsumer) {
        this.stringConsumer = stringConsumer;
    }

    @Override
    public void print(Board board) {
        String[][] stringedBoard = board.stringify();

        String[] lines = new String[3];

        for (int index = 0; index < 3; index++) {
            String[] line = stringedBoard[index];
            lines[index] = line[0] + COLUMN_SEPARATOR + line [1] + COLUMN_SEPARATOR + line[2];
        }

        stringConsumer.accept(lines[0]);
        stringConsumer.accept("-----");
        stringConsumer.accept(lines[1]);
        stringConsumer.accept("-----");
        stringConsumer.accept(lines[2]);
    }

}
