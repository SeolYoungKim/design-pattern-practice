package _19_templatemethod;

public class App {
    public static void main(String[] args) {
        System.out.println("==============거래내역==============");
        final PaymentService creditCard = new CreditCard();
        creditCard.pay(10_00_000);

        System.out.println("----------------------------------");
        final PaymentService kakaoPay = new KakaoPay();
        kakaoPay.pay(10_00_000);

        System.out.println("----------------------------------");
        final PaymentService naverPay = new NaverPay();
        naverPay.pay(10_00_000);

        System.out.println("==================================");
        System.out.println("총 이윤: " + PaymentService.getTotalProfit());
    }
}
