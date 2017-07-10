package tictactoe;

public class AlreadyFilledCaseError extends Throwable {

    private String message;

    public AlreadyFilledCaseError(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
