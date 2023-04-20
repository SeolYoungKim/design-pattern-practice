package _17_state;

public class HappyState implements State {
    @Override
    public void tellOfState() {
        System.out.println("행복해서 죽기 직전");
    }
}
