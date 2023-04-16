package _13_command;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    private final List<Command> commands = new ArrayList<>();

    public void addCommand(final Command command) {
        commands.add(command);
    }

    public void addCommands(final List<Command> commands) {
        this.commands.addAll(commands);
    }

    public void executeCommands() {
        commands.forEach(Command::execute);
    }

    public static void main(String[] args) {
        final Robot robot = new Robot();

        final KeyBoard keyBoard = new KeyBoard();
        final Mouse mouse = new Mouse();
        robot.addCommands(List.of(
                new KeyBoardUpCommand(keyBoard),
                new KeyBoardDownCommand(keyBoard),
                new MouseClickCommand(mouse),
                new MouseScrollCommand(mouse)
        ));

        robot.executeCommands();
    }
}
