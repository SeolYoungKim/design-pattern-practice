package _05_adapter.practice2;

import java.util.HashMap;
import java.util.Map;

public class MemberService {
    private static final Map<String, Member> memberRepository = new HashMap<>();
    static {
        memberRepository.put("kim", new Member("kim", "1234", "img", "body"));
    }

    public Member findMemberByUsername(String username) {
        if (!memberRepository.containsKey(username)) {
            throw new IllegalArgumentException();
        }
        return memberRepository.get(username);
    }
}
