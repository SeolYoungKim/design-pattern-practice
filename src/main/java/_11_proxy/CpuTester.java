package _11_proxy;

import java.util.List;

public class CpuTester {
    public static void main(String[] args) {
        final PerformanceMeasurer performanceMeasurer = new PerformanceMeasurer(
                List.of(new IntelCpu(), new AmdCpu()));

        performanceMeasurer.operate();
    }
}
