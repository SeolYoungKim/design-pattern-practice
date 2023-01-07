package _05_adapter.practice2;

import _05_adapter.practice2.security.LoginHandler;
import _05_adapter.practice2.security.UserDetails;

public class Main {
    public static void main(String[] args) {
        MemberUserDetailsServiceAdapter memberUserDetailsServiceAdapter = new MemberUserDetailsServiceAdapter(
                new MemberService());

        LoginHandler loginHandler = new LoginHandler(memberUserDetailsServiceAdapter);
        String result = loginHandler.login("kim", "1234");

        System.out.println(result);
    }
}
