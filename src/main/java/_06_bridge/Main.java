package _06_bridge;

public class Main {
    public static void main(String[] args) {
        final ProductImpl laptop = new ProductImpl(new Laptop());
        laptop.sell();

        final ProductImpl cellPhone = new ProductImpl(new CellPhone());
        cellPhone.sell();
    }
}
