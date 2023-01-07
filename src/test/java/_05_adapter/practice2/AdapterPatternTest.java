package _05_adapter.practice2;

import _05_adapter.practice2.security.LoginHandler;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AdapterPatternTest {
    private MemberUserDetailsServiceAdapter memberUserDetailsServiceAdapter;
    private LoginHandler loginHandler;

    @BeforeEach
    void setUp() {
        memberUserDetailsServiceAdapter = new MemberUserDetailsServiceAdapter(
                new MemberService());

        loginHandler = new LoginHandler(memberUserDetailsServiceAdapter);
    }

    @DisplayName("로그인이 성공한다.")
    @Test
    void successLogin() {
        String result = loginHandler.login("kim", "1234");
        Assertions.assertThat(result).isEqualTo("kim");
    }

    @DisplayName("없는 회원을 조회하면 로그인이 실패한다.")
    @Test
    void failLogin1() {
        Assertions.assertThatThrownBy(() -> loginHandler.login("park", "345"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("비밀번호를 틀리면 로그인이 실패한다.")
    @Test
    void failLogin2() {
        Assertions.assertThatThrownBy(() -> loginHandler.login("kim", "345"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}