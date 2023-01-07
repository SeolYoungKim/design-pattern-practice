package _05_adapter.practice2.security;

public class LoginHandler {
    private final UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public String login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUser(username);
        if (userDetails.getPassword().equals(password)) {
            System.out.println("로그인 성공!");
            return userDetails.getUsername();
        } else {
            throw new IllegalArgumentException("올바르지 않은 비밀번호 입니다.");
        }
    }
}
