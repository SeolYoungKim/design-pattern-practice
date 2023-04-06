package _08_decorator;

public class DefaultHello implements Hello {
    @Override
    public void hello() {
        System.out.println("안녕하세요. 저는 김설영 입니다.");
    }
}
