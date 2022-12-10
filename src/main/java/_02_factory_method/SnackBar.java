package _02_factory_method;

import _02_factory_method.factory.CandyFactory;
import _02_factory_method.factory.ChocolateFactory;
import _02_factory_method.factory.CookieFactory;
import _02_factory_method.factory.IceCreamFactory;
import _02_factory_method.factory.SnackFactory;
import _02_factory_method.snack.Snack;

public class SnackBar {
    public static void main(String[] args) {
        SnackBar snackBar = new SnackBar();
        snackBar.makeSnack(new ChocolateFactory());
        snackBar.makeSnack(new CandyFactory());
        snackBar.makeSnack(new CookieFactory());
        snackBar.makeSnack(new IceCreamFactory());
    }

    public Snack makeSnack(SnackFactory snackFactory) {
        Snack snack = snackFactory.makeSnack();
        System.out.println(snack);

        return snack;
    }
}
