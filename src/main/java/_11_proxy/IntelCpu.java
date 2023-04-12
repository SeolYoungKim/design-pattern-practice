package _11_proxy;

public class IntelCpu implements Cpu {
    @Override
    public void operate() {
        System.out.println("========= 연산중... =========");
        System.out.println("인텔 CPU가 연산을 하고있습니다.");

        try {
            Thread.sleep(1500L);
        } catch (InterruptedException ignored) {}

        System.out.println("인텔 CPU가 연산을 완료했습니다.");
        System.out.println("========= 연산 종료 =========");
    }

    @Override
    public String toString() {
        return "IntelCpu";
    }
}
