package _09_facade.user;

public class UserService {
    private static final User DEFAULT_USER = new User();
    public void increaseMoney(int productFee) {
        DEFAULT_USER.increaseMoney(productFee);
    }

    public void decreaseMoney(int productFee) {
        DEFAULT_USER.decreaseMoney(productFee);
    }
}
