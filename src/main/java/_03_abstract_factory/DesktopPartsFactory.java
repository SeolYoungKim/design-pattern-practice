package _03_abstract_factory;

import _03_abstract_factory.cpu.Cpu;
import _03_abstract_factory.mainboard.MainBoard;
import _03_abstract_factory.memory.Memory;
import _03_abstract_factory.ssd.Ssd;

public interface DesktopPartsFactory {
    Cpu cpu();

    MainBoard mainBoard();

    Memory memory();

    Ssd ssd();
}
