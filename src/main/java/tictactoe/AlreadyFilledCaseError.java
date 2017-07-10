package tictactoe;

public class AlreadyFilledCaseError extends Exception {

    private String message;

    public AlreadyFilledCaseError() {
        this.message = "You can't play here";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
