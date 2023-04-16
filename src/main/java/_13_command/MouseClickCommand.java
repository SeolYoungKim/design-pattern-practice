package _13_command;

public class MouseClickCommand implements Command {
    private final Mouse mouse;

    public MouseClickCommand(final Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public void execute() {
        mouse.click();
    }
}
