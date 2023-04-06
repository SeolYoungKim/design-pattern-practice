package _08_decorator;

public class KimSeolYoung {
    private static boolean pretty = true;
    private static boolean end = false;

    public static void main(String[] args) {
        Hello hello = new DefaultHello();

        if (pretty) {
            hello = new PrettyHelloDecorator(hello);
        }

        if (end) {
            hello = new EndHelloDecorator(hello);
        }

        hello.hello();
    }
}
