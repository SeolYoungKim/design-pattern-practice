package _19_templatemethod;

public class KakaoPay extends PaymentService {
    @Override
    protected long getBenefit(final long amount) {
        System.out.println("카카오페이로 결제 시 10% 할인");
        return amount - (amount / 10);
    }
}
