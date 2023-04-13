package _12_chain_of_responsibilities;

public abstract class ToDoList {
    private final ToDoList nextTodoList;

    protected ToDoList(final ToDoList nextTodoList) {
        this.nextTodoList = nextTodoList;
    }

    public void todo() {
        if (nextTodoList != null) {
            nextTodoList.todo();
        }
    }
}
