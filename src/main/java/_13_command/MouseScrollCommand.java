package _13_command;

public class MouseScrollCommand implements Command {
    private final Mouse mouse;

    public MouseScrollCommand(final Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public void execute() {
        mouse.scroll();
    }
}
