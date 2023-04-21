package _21_visitor;

public class PlayStation implements GameProvider {
    @Override
    public void accept(final Game game) {
        game.print(this);
    }
}
