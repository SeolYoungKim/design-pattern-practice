package _08_decorator;

public class EndHelloDecorator extends HelloDecorator {
    public EndHelloDecorator(final Hello hello) {
        super(hello);
    }

    @Override
    public void hello() {
        super.hello();
        System.out.println("잘 부탁드립니다.");
    }
}
