package _03_abstract_factory;

import _03_abstract_factory.cpu.Amd;
import _03_abstract_factory.mainboard.Asus;
import _03_abstract_factory.memory.Samsung;
import _03_abstract_factory.ssd.SamsungEvo;

public class DesktopFactory {
    // 부품 팩토리를 가져올거임
    private final DesktopPartsFactory partsFactory;

    public DesktopFactory(DesktopPartsFactory partsFactory) {
        this.partsFactory = partsFactory;
    }

    // 얘는 너무 구체적이다. 클라이언트가 사용하는 입장에서 모두 알아야 한다.
    // 갈아 끼우기도 매우 어렵다. 하지만 부품은 셋트다. (사실 조립식 컴퓨터 부품은 셋트란 개념이 없긴한데 ㅠㅠ 일단 있다고 치자)
    // 셋트가 정해진 상태라면 정해진 세트만 호출해서 사용하도록 하면 유연해질 수 있다
    public Desktop desktopVer1() {
        return new Desktop(
                new Amd(),
                new Asus(),
                new Samsung(),
                new SamsungEvo()
        );
    }

    // 아래와 같이 팩토리 인터페이스에 의존하도록 하면, 팩토리 인터페이스 구현체가 무엇이냐에 따라 유연하게 바뀐다.
    // 클라이언트 입장에서는 원하는 팩토리만 호출해서 쓰면 된다.
    public Desktop desktopVer2() {
        return new Desktop(
                partsFactory.cpu(),
                partsFactory.mainBoard(),
                partsFactory.memory(),
                partsFactory.ssd()
        );
    }
}
