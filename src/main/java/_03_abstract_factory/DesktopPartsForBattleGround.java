package _03_abstract_factory;

import _03_abstract_factory.cpu.Amd;
import _03_abstract_factory.cpu.Cpu;
import _03_abstract_factory.cpu.Intel;
import _03_abstract_factory.mainboard.Asus;
import _03_abstract_factory.mainboard.MainBoard;
import _03_abstract_factory.mainboard.Msi;
import _03_abstract_factory.memory.Memory;
import _03_abstract_factory.memory.Samsung;
import _03_abstract_factory.memory.Sk;
import _03_abstract_factory.ssd.SamsungEvo;
import _03_abstract_factory.ssd.Ssd;
import _03_abstract_factory.ssd.WesternDigital;

public class DesktopPartsForBattleGround implements DesktopPartsFactory{
    @Override
    public Cpu cpu() {
        return new Intel();
    }

    @Override
    public MainBoard mainBoard() {
        return new Asus();
    }

    @Override
    public Memory memory() {
        return new Samsung();
    }

    @Override
    public Ssd ssd() {
        return new SamsungEvo();
    }
}
