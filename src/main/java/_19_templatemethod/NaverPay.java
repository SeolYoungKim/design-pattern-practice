package _19_templatemethod;

public class NaverPay extends PaymentService {
    @Override
    protected long getBenefit(final long amount) {
        System.out.println("네이버 페이로 결제 시 이천원 할인");
        return amount - 2000;
    }
}
