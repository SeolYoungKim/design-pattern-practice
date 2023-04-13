package _12_chain_of_responsibilities;

public class Human {
    private final String name;
    private final ToDoList toDoList;

    public Human(final String name, final ToDoList toDoList) {
        this.name = name;
        this.toDoList = toDoList;
    }

    public void doSomething() {
        System.out.println("==================================");
        System.out.println(name + "이/가 오늘 할 일을 수행합니다.");
        toDoList.todo();
        System.out.println("==================================");
    }
}
