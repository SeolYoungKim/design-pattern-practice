package _12_chain_of_responsibilities;

public class Shoopping extends ToDoList {
    protected Shoopping(final ToDoList nextTodoList) {
        super(nextTodoList);
    }

    @Override
    public void todo() {
        System.out.println("쇼핑을 했습니다.");
        super.todo();
    }
}
