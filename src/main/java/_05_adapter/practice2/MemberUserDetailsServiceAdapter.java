package _05_adapter.practice2;

import _05_adapter.practice2.security.UserDetails;
import _05_adapter.practice2.security.UserDetailsService;

public class MemberUserDetailsServiceAdapter implements UserDetailsService {
    private final MemberService memberService;

    public MemberUserDetailsServiceAdapter(MemberService memberService) {
        this.memberService = memberService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Member member = memberService.findMemberByUsername(username);
        return new MemberUserDetailsAdapter(member);
    }
}
