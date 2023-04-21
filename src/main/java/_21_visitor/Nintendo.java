package _21_visitor;

import _21_visitor.Game;
import _21_visitor.GameProvider;

public class Nintendo implements GameProvider  {
    @Override
    public void accept(final Game game) {
        game.print(this);
    }
}
