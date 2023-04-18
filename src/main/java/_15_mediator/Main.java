package _15_mediator;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Main {
    public static void main(String[] args)
            throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        final User user = new User(new SmartPhone(new Coupang(), new BaeMin(), new KbBank(), new HyundaiCard()),
                "김설영");

        user.internetBanking();
        user.orderFoodDelivery();
        user.orderMacbook();
        user.checkAmount();

        // 아래는 디자인 패턴과 무관함
//        final SmartPhoneReflectionVer smartPhoneReflectionVer = new SmartPhoneReflectionVer(List.of(
//                new Coupang(),
//                new BaeMin(),
//                new KbBank(),
//                new HyundaiCard()
//        ));
//
//        final User user1 = new User(smartPhoneReflectionVer, "김설영");
//        user1.invoke();
    }
}
