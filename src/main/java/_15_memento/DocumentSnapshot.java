package _15_memento;

public class DocumentSnapshot {
    private final String title;
    private final String content;

    public DocumentSnapshot(final Document document) {
        this.title = document.getTitle();
        this.content = document.getContent();
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
