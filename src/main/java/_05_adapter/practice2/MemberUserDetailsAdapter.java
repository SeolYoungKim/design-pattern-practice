package _05_adapter.practice2;

import _05_adapter.practice2.security.UserDetails;

public class MemberUserDetailsAdapter implements UserDetails {
    private final Member member;

    public MemberUserDetailsAdapter(Member member) {
        this.member = member;
    }

    @Override
    public String getUsername() {
        return member.name();
    }

    @Override
    public String getPassword() {
        return member.password();
    }
}
