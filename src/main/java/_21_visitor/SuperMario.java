package _21_visitor;

public class SuperMario implements Game {
    @Override
    public void print(final Steam steam) {
        System.out.println("Steam에서 SuperMario를 다운로드 받았습니다.");
    }

    @Override
    public void print(final Nintendo nintendo) {
        System.out.println("Nintendo에서 SuperMario를 다운로드 받았습니다.");
    }

    @Override
    public void print(final PlayStation playStation) {
        System.out.println("PlayStation에서 SuperMario를 다운로드 받았습니다.");
    }
}
