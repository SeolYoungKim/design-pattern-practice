package _16_observer;

public class DefaultSubscriber implements Subscriber {
    private final String name;

    public DefaultSubscriber(final String name) {
        this.name = name;
    }

    @Override
    public void printContent(final String content) {
        System.out.printf("%s에게 \"%s\" 게시글 발행\n", name, content);
    }
}
