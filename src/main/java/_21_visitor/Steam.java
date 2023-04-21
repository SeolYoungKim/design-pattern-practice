package _21_visitor;

public class Steam implements GameProvider {
    @Override
    public void accept(final Game game) {
        game.print(this);
    }
}
