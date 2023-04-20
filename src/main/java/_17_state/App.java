package _17_state;

public class App {
    public static void main(String[] args) {
        final Human human = new Human(new NormalState());
        human.tellOfState();

        human.changeStateTo(new SickState());
        human.tellOfState();
        if (human.isSick()) {
            System.out.println("갔다오셈");
        }

        human.changeStateTo(new AngryState());
        human.tellOfState();

        System.out.println("Human 이/가 집에 갔습니다.");
        human.changeStateTo(new HappyState());
        human.tellOfState();
    }
}
