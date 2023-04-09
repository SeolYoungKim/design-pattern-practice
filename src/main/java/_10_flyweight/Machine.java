package _10_flyweight;

public class Machine {
    private final MachineConfig machineConfig;

    public Machine(final MachineConfig machineConfig) {
        this.machineConfig = machineConfig;
    }

    public MachineConfig getMachineConfig() {
        return machineConfig;
    }
}
