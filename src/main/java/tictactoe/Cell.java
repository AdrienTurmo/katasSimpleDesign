package tictactoe;

import java.util.Optional;

public class Cell {

    private Optional<Symbol> content;

    public Cell() {
        content = Optional.empty();
    }

    @Override
    public String toString() {
        if (content.isPresent()) {
            return content.get().name();
        }
        return " ";
    }


    public void put(Symbol symbol) throws AlreadyFilledCaseError{
        if (content.isPresent()) {
            throw new AlreadyFilledCaseError();
        }
        content = Optional.of(symbol);
    }
}
