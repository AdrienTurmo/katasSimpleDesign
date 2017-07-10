package tictactoe;

public enum Symbol {
    O, X;

    public Symbol changeToTheOther() {
        switch (this) {
            case X:
                return O;
            case O:
                return X;
        }
        return this;
    }
}
