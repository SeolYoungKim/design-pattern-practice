package _08_decorator;

public class PrettyHelloDecorator extends HelloDecorator {
    public PrettyHelloDecorator(final Hello hello) {
        super(hello);
    }

    @Override
    public void hello() {
        System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
        super.hello();
        System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
    }
}
