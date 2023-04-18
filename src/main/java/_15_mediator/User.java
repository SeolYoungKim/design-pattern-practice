package _15_mediator;

import java.lang.reflect.InvocationTargetException;

public class User {
    private final SmartPhone smartPhone;
    private final String name;

    public User(final SmartPhone smartPhone, final String name) {
        this.smartPhone = smartPhone;
        this.name = name;
    }

    public void internetBanking() {
        smartPhone.internetBanking(name);
    }

    public void orderFoodDelivery() {
        smartPhone.orderFoodDelivery(name);
    }

    public void orderMacbook() {
        smartPhone.orderMacbook(name);
    }

    public void checkAmount() {
        smartPhone.checkAmount(name);
    }
}
