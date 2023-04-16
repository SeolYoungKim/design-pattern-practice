package _13_command;

public class KeyBoardDownCommand implements Command {
    private final KeyBoard keyBoard;

    public KeyBoardDownCommand(final KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    @Override
    public void execute() {
        keyBoard.pressDownKey();
    }
}
