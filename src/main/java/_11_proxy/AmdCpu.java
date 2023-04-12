package _11_proxy;

public class AmdCpu implements Cpu {
    @Override
    public void operate() {
        System.out.println("========= 연산중... =========");
        System.out.println("AMD CPU가 연산을 하고있습니다.");

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException ignored) {}

        System.out.println("AMD CPU가 연산을 완료했습니다.");
        System.out.println("========= 연산 종료 =========");
    }

    @Override
    public String toString() {
        return "AmdCpu";
    }
}
