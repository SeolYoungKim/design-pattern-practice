package _15_mediator;

public class HyundaiCard implements App  {
    public void checkAmount(final String name) {
        System.out.println(name + "이 납부해야 할 카드 금액을 보고 기절했습니다.");
    }
}
