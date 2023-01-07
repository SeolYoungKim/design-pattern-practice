package _05_adapter.practice1;

import _05_adapter.practice1.domain.Member;
import _05_adapter.practice1.domain.MemberRepository;
import _05_adapter.practice1.jpa.DefaultJpaRepository;
import _05_adapter.practice1.jpa.JpaMemberEntity;

public class MemberRepositoryJpaAdapter implements MemberRepository {
    private final DefaultJpaRepository jpaRepository;

    public MemberRepositoryJpaAdapter(DefaultJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Member findById(Long id) {
        JpaMemberEntity jpaMemberEntity = jpaRepository.findById(id);
        return new Member(jpaMemberEntity.name(), jpaMemberEntity.age());
    }
}
