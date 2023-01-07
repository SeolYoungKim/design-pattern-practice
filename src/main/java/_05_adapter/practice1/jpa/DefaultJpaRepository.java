package _05_adapter.practice1.jpa;

import java.util.HashMap;
import java.util.Map;

public class DefaultJpaRepository implements JpaRepository<JpaMemberEntity, Long> {
    private final Map<Long, JpaMemberEntity> repository = new HashMap<>();
    private Long id = 0L;

    @Override
    public JpaMemberEntity save(JpaMemberEntity jpaMemberEntity) {
        repository.put(++id, jpaMemberEntity);
        return jpaMemberEntity;
    }

    @Override
    public void update(Long id, JpaMemberEntity jpaMemberEntity) {
        JpaMemberEntity entityForUpdate = repository.get(id);
        entityForUpdate.update(jpaMemberEntity);
    }

    @Override
    public void delete(Long id) {
        repository.remove(id);
    }

    @Override
    public JpaMemberEntity findById(Long id) {
        return repository.get(id);
    }
}
