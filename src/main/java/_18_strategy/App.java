package _18_strategy;

public class App {
    public static void main(String[] args) {
        final HelloBot helloBot = new HelloBot();
        helloBot.sayHello(new Korean());
        helloBot.sayHello(new Japanese());
        helloBot.sayHello(new English());
        helloBot.sayHello(new Chinese());
        helloBot.sayHello(() -> System.out.println("ㅎㅇ"));
    }
}
