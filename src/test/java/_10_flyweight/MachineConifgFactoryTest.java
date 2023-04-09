package _10_flyweight;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FlyweightTest {
    @DisplayName("플라이웨이트 패턴을 적용하지 않으면 모든 설정이 기본 설정임에도 서로 다른 객체다.")
    @Test
    void test() {
        final Machine machine1 = new Machine(new MachineConfig("기본 설정"));
        final Machine machine2 = new Machine(new MachineConfig("기본 설정"));
        final Machine machine3 = new Machine(new MachineConfig("기본 설정"));

        assertThat(machine1.getMachineConfig()).isNotSameAs(machine2.getMachineConfig());
        assertThat(machine2.getMachineConfig()).isNotSameAs(machine3.getMachineConfig());
        assertThat(machine1.getMachineConfig()).isNotSameAs(machine3.getMachineConfig());
    }

    @DisplayName("플라이웨이트 패턴을 적용하면 모든 설정이 기본 설정이면 서로 같은 객체다.")
    @Test
    void test2() {
        final MachineConifgFactory factory = new MachineConifgFactory();
        final Machine machine1 = new Machine(factory.getMachineConfig("기본 설정"));
        final Machine machine2 = new Machine(factory.getMachineConfig("기본 설정"));
        final Machine machine3 = new Machine(factory.getMachineConfig("기본 설정"));

        assertThat(machine1.getMachineConfig()).isSameAs(machine2.getMachineConfig());
        assertThat(machine2.getMachineConfig()).isSameAs(machine3.getMachineConfig());
        assertThat(machine1.getMachineConfig()).isSameAs(machine3.getMachineConfig());
    }
}