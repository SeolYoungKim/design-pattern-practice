package _05_adapter.practice1.jpa;

public class JpaMemberEntity {
    private String name;
    private String password;

    public JpaMemberEntity(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public String age() {
        return password;
    }

    public void update(JpaMemberEntity other) {
        this.name = other.name;
        this.password = other.password;
    }
}
