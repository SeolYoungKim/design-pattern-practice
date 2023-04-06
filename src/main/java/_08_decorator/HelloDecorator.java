package _08_decorator;

public class HelloDecorator implements Hello {
    private final Hello hello;

    public HelloDecorator(final Hello hello) {
        this.hello = hello;
    }

    @Override
    public void hello() {
        hello.hello();
    }
}
