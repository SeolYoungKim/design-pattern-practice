package _20_templatecallback;

public enum Pay {
    CREDIT_CARD(amount -> amount - 1000),
    NAVER_PAY(amount -> amount - 2000),
    KAKAO_PAY(amount -> amount - (amount / 10));

    private final BenefitService benefit;

    Pay(final BenefitService benefit) {
        this.benefit = benefit;
    }

    public BenefitService getBenefit() {
        return benefit;
    }
}
