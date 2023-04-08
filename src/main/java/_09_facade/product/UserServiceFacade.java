package _09_facade.product;

import _09_facade.user.UserService;

public class UserServiceFacade {
    private final UserService userService;

    public UserServiceFacade(final UserService userService) {
        this.userService = userService;
    }

    public void increaseMoney(final int productFee) {
        userService.increaseMoney(productFee);
    }

    public void decreaseMoney(final int productFee) {
        userService.decreaseMoney(productFee);
    }
}
