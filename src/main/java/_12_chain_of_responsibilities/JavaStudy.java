package _12_chain_of_responsibilities;

public class JavaStudy extends ToDoList {
    protected JavaStudy(final ToDoList nextTodoList) {
        super(nextTodoList);
    }

    @Override
    public void todo() {
        System.out.println("자바 공부를 했습니다.");
        super.todo();
    }
}
