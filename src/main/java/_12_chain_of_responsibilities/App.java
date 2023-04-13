package _12_chain_of_responsibilities;

public class App {
    public static void main(String[] args) {
        final ToDoList todoList1 = new Eating(new Shoopping(new PlayGame(new JavaStudy(null))));
        final ToDoList todoList2 = new Eating(new Shoopping(new PlayGame(null)));

        final Human me = new Human("김설영", todoList1);
        me.doSomething();

        final Human you = new Human("이동준", todoList2);
        you.doSomething();
    }
}
