package _11_proxy;

import java.util.List;

public class PerformanceMeasurer implements Cpu {
    private final List<Cpu> cpus;

    public PerformanceMeasurer(final List<Cpu> cpus) {
        this.cpus = cpus;
    }

    @Override
    public void operate() {
        for (Cpu cpu : cpus) {
            final long before = System.currentTimeMillis();
            cpu.operate();
            final long after = System.currentTimeMillis() - before;

            System.out.printf("[%s] 성능 측정 완료. 연산까지 걸린 시간=%d", cpu, after);
            System.out.println();
            System.out.println("#############################################");
        }
    }
}
