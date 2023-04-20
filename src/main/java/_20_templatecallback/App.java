package _20_templatecallback;

public class App {
    public static void main(String[] args) {
        final PaymentService paymentService = new PaymentService();
        System.out.println("============== 신용카드 ==============");
        paymentService.pay((long a) -> a - 1000, 100_000_000);
        paymentService.pay(Pay.CREDIT_CARD.getBenefit(), 100_000_000);

        System.out.println("==============네이버페이==============");
        paymentService.pay((long a) -> a - 2000, 100_000_000);
        paymentService.pay(Pay.NAVER_PAY.getBenefit(), 100_000_000);

        System.out.println("==============카카오페이==============");
        paymentService.pay((long a) -> a - (a / 10), 100_000_000);
        paymentService.pay(Pay.KAKAO_PAY.getBenefit(), 100_000_000);

        System.out.println("============== 총 이윤 ==============");
        System.out.println("총 이윤: " + PaymentService.getTotalProfit());
    }
}
