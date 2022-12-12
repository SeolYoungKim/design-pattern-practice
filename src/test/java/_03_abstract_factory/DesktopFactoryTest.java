package _03_abstract_factory;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class DesktopFactoryTest {

    @DisplayName("DesktopPartsFactory 구현체가 달라지면")
    @Nested
    class desktopConstructTest {

        @DisplayName("생성되는 Desktop의 사양이 달라진다. 입력된 구현체 : DesktopPartsForLeagueOfLegends")
        @Test
        void case1() {
            DesktopFactory factory = new DesktopFactory(
                    new DesktopPartsForLeagueOfLegends());

            Desktop desktop = factory.desktopVer2();
            Assertions.assertThat(desktop.cpu()).contains("AMD");
        }

        @DisplayName("생성되는 Desktop의 사양이 달라진다. 입력된 구현체 : DesktopPartsForBattleGround")
        @Test
        void case2() {
            DesktopFactory factory = new DesktopFactory(
                    new DesktopPartsForBattleGround());

            Desktop desktop = factory.desktopVer2();
            Assertions.assertThat(desktop.cpu()).contains("Intel");
        }
    }

}