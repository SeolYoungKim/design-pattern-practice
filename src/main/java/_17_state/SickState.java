package _17_state;

public class SickState implements State {
    @Override
    public void tellOfState() {
        System.out.println("아파서 병원좀 다녀오겠습니다.");
    }
}
