package tictactoe;

import java.util.Objects;

public class Cell {

    private String content = " ";

    public Cell(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return Objects.equals(content, cell.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }
}
