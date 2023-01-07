package _05_adapter.practice1.jpa;

public interface JpaRepository<T, ID> {
    T save(T t);

    void update(ID id, T t);

    void delete(ID id);

    T findById(ID id);
}
