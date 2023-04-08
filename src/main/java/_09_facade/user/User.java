package _09_facade.user;

public class User {
    private int money;

    public void increaseMoney(int money) {
        this.money += money;
    }

    public void decreaseMoney(int money) {
        this.money -= money;
    }
}
