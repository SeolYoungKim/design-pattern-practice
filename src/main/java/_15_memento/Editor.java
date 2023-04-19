package _15_memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class Editor {
    private static final Deque<DocumentSnapshot> snapshotStack = new ArrayDeque<>();

    public static void main(String[] args) {
        //Document 생성
        final Document document = new Document("title", "content");

        //Document 스냅샷 저장
        snapshotStack.push(new DocumentSnapshot(document));

        //Document 수정
        editDocument(document, "new title", "new content");
        System.out.println("edit document = " + document);

        // 수정 전으로 되돌리기
        rollbackDocument(document);

        System.out.println("rollback document = " + document);
    }

    private static void editDocument(final Document document, final String newTitle,
            final String newContent) {
        document.setTitle(newTitle);
        document.setContent(newContent);
    }

    private static void rollbackDocument(final Document document) {
        final DocumentSnapshot documentSnapshot = snapshotStack.pop();
        document.setTitle(documentSnapshot.getTitle());
        document.setContent(documentSnapshot.getContent());
    }
}
