package _02_factory_method.factory;

import _02_factory_method.snack.Snack;

public interface SnackFactory {

    default Snack makeSnack() {
        System.out.println("스낵을 만듭니다.");
        return snack();
    }

    Snack snack();
}
