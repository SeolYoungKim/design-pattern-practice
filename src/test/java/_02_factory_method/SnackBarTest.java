package _02_factory_method;

import static org.junit.jupiter.api.Assertions.*;

import _02_factory_method.factory.CandyFactory;
import _02_factory_method.factory.ChocolateFactory;
import _02_factory_method.factory.CookieFactory;
import _02_factory_method.factory.IceCreamFactory;
import _02_factory_method.factory.SnackFactory;
import _02_factory_method.snack.Candy;
import _02_factory_method.snack.Chocolate;
import _02_factory_method.snack.Cookie;
import _02_factory_method.snack.IceCream;
import _02_factory_method.snack.Snack;
import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SnackBarTest {


    @ParameterizedTest(name = "객체에 따라 다른 스낵이 생성된다.")
    @MethodSource("provideSnackFactory")
    void makeSnackTest(SnackFactory snackFactory, Class<? extends Snack> expected) {
        SnackBar snackBar = new SnackBar();
        Snack snack = snackBar.makeSnack(snackFactory);
        Class<? extends Snack> actual = snack.getClass();

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> provideSnackFactory() {
        return Stream.of(
                Arguments.of(new ChocolateFactory(), Chocolate.class),
                Arguments.of(new CandyFactory(), Candy.class),
                Arguments.of(new CookieFactory(), Cookie.class),
                Arguments.of(new IceCreamFactory(), IceCream.class)
        );
    }
}
