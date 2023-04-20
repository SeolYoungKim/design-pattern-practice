package _19_templatemethod;

public class CreditCard extends PaymentService {
    @Override
    protected long getBenefit(final long amount) {
        System.out.println("신용 카드로 결제 시 천원 할인");
        return amount - 1000;
    }
}
