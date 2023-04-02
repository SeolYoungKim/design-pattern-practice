package _06_bridge;

public class ProductImpl implements Product {
    private final Type type;

    public ProductImpl(final Type type) {
        this.type = type;
    }

    @Override
    public void sell() {
        System.out.println(type.getName() + "을 판매하였습니다.");
    }
}
