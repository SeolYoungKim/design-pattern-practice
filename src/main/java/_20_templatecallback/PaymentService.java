package _20_templatecallback;

public class PaymentService {
    private static long totalProfit;

    public static long getTotalProfit() {
        return totalProfit;
    }

    public final void pay(final BenefitService benefitService, final long amount) {
        // 할인 로직이 다르다.
        final long benefit = benefitService.getBenefit(amount);
        System.out.println("청구 금액: " + benefit);

        totalProfit = totalProfit + benefit;  // PaymentService의 profit에 지불 금액만큼 저장
    }
}
