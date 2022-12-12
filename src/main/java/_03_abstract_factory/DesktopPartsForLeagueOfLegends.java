package _03_abstract_factory;

import _03_abstract_factory.cpu.Amd;
import _03_abstract_factory.cpu.Cpu;
import _03_abstract_factory.mainboard.MainBoard;
import _03_abstract_factory.mainboard.Msi;
import _03_abstract_factory.memory.Memory;
import _03_abstract_factory.memory.Sk;
import _03_abstract_factory.ssd.Ssd;
import _03_abstract_factory.ssd.WesternDigital;

public class DesktopPartsForLeagueOfLegends implements DesktopPartsFactory{
    @Override
    public Cpu cpu() {
        return new Amd();
    }

    @Override
    public MainBoard mainBoard() {
        return new Msi();
    }

    @Override
    public Memory memory() {
        return new Sk();
    }

    @Override
    public Ssd ssd() {
        return new WesternDigital();
    }
}
