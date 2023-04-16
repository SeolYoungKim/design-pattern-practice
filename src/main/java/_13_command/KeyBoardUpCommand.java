package _13_command;

public class KeyBoardUpCommand implements Command {
    private final KeyBoard keyBoard;

    public KeyBoardUpCommand(final KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    @Override
    public void execute() {
        keyBoard.pressUpKey();
    }
}
