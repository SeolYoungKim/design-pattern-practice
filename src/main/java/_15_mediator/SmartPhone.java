package _15_mediator;

public class SmartPhone {
    private final Coupang coupang;
    private final BaeMin baeMin;
    private final KbBank kbBank;
    private final HyundaiCard hyundaiCard;

    public SmartPhone(final Coupang coupang, final BaeMin baeMin, final KbBank kbBank,
            final HyundaiCard hyundaiCard) {
        this.coupang = coupang;
        this.baeMin = baeMin;
        this.kbBank = kbBank;
        this.hyundaiCard = hyundaiCard;
    }

    public void internetBanking(final String name) {
        kbBank.internetBanking(name);
    }

    public void orderFoodDelivery(final String name) {
        baeMin.orderFoodDelivery(name);
    }

    public void orderMacbook(final String name) {
        coupang.orderMacbook(name);
    }

    public void checkAmount(final String name) {
        hyundaiCard.checkAmount(name);
    }
}
