package _02_factory_method.factory;

import _02_factory_method.snack.Chocolate;
import _02_factory_method.snack.Cookie;
import _02_factory_method.snack.Snack;

public class CookieFactory implements SnackFactory {
    @Override
    public Snack snack() {
        return new Cookie("촉촉한 초코칩");
    }
}
