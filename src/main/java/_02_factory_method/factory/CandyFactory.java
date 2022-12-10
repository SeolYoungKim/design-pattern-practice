package _02_factory_method.factory;

import _02_factory_method.snack.Candy;
import _02_factory_method.snack.Chocolate;
import _02_factory_method.snack.Snack;

public class CandyFactory implements SnackFactory {
    @Override
    public Snack snack() {
        return new Candy("츄파춥스");
    }
}
