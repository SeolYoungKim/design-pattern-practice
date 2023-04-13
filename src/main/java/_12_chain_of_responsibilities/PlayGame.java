package _12_chain_of_responsibilities;

public class PlayGame extends ToDoList {
    protected PlayGame(final ToDoList nextTodoList) {
        super(nextTodoList);
    }

    @Override
    public void todo() {
        System.out.println("게임을 했습니다.");
        super.todo();
    }
}
