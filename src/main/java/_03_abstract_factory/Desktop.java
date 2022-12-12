package _03_abstract_factory;

import _03_abstract_factory.cpu.Cpu;
import _03_abstract_factory.mainboard.MainBoard;
import _03_abstract_factory.memory.Memory;
import _03_abstract_factory.ssd.Ssd;

public class Desktop {
    private final Cpu cpu;
    private final MainBoard mainBoard;
    private final Memory memory;
    private final Ssd ssd;

    public Desktop(Cpu cpu, MainBoard mainBoard, Memory memory, Ssd ssd) {
        this.cpu = cpu;
        this.mainBoard = mainBoard;
        this.memory = memory;
        this.ssd = ssd;
    }

    public String cpu() {
        return "CPU: " + cpu;
    }

    public String mainBoard() {
        return "MainBoard: " + mainBoard;
    }

    public String memory() {
        return "Memory: " + memory;
    }

    public String ssd() {
        return "SSD: " + ssd;
    }
}
