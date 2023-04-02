package _06_bridge;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BridgePatternTest {
    @DisplayName("구현체에 Laptop이 오면, name 값은 '랩탑'이다.")
    @Test
    void test1() {
        final ProductImpl product = new ProductImpl(new Laptop());
        assertThat(product.getProductName()).isEqualTo("랩탑");
    }

    @DisplayName("구현체에 CellPhone이 오면, name 값은 '휴대전화'이다.")
    @Test
    void test2() {
        final ProductImpl product = new ProductImpl(new CellPhone());
        assertThat(product.getProductName()).isEqualTo("휴대전화");
    }
}