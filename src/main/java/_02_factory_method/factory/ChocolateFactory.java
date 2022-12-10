package _02_factory_method.factory;

import _02_factory_method.snack.Chocolate;
import _02_factory_method.snack.Snack;

public class ChocolateFactory implements SnackFactory {
    @Override
    public Snack snack() {
        return new Chocolate("가나 초콜렛");
    }
}
