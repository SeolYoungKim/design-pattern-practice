package _17_state;

public class NormalState implements State {
    @Override
    public void tellOfState() {
        System.out.println("무난한 상태입니다. 집에가고싶음.");
    }
}
