package _01_singleton;

// 리플렉션에 뚫림
public class Singleton {  // 호출 시 초기화 (static method를 호출했다거나..)

    static {
        System.out.println("외부 초기화 ");
    }

    // 이른 초기화
//    private static final Singleton SINGLETON = new Singleton();  // 얘가 먼저 초기화됨!!
//
//    public static Singleton getInstance() {
//        return SINGLETON;  // 이른 초기화 -> 스레드에 안전하다! 다만, 미리 만드는게 단점이다. (이른 초기화. 호출하면 만들었음 좋겠지만 안됨.)
//    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
        static {
            System.out.println("내부 초기화");
        }
    }

    public static Singleton getInstance() {
        System.out.println("메서드 실행");
        return SingletonHolder.INSTANCE;  // 호출 시 초기화!
    }
}
