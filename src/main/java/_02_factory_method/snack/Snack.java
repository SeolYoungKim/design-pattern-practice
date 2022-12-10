package _02_factory_method.snack;

public abstract class Snack {
    private final String name;

    public Snack(String name) {
        this.name = name;
        System.out.println("스낵이 만들어 졌습니다. 이름: " + name);
    }

    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "name='" + name + '\'' +
                '}';
    }
}
