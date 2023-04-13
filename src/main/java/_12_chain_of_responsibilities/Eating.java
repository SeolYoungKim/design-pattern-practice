package _12_chain_of_responsibilities;

public class Eating extends ToDoList {
    protected Eating(final ToDoList nextTodoList) {
        super(nextTodoList);
    }

    @Override
    public void todo() {
        System.out.println("식당에 가서 밥을 먹었습니다.");
        super.todo();
    }
}
