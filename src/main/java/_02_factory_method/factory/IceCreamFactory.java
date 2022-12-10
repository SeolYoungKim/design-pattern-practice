package _02_factory_method.factory;

import _02_factory_method.snack.Chocolate;
import _02_factory_method.snack.IceCream;
import _02_factory_method.snack.Snack;

public class IceCreamFactory implements SnackFactory {
    @Override
    public Snack snack() {
        return new IceCream("메로나");
    }
}
