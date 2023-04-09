package _10_flyweight;

import java.util.HashMap;
import java.util.Map;

public class MachineConifgFactory {
    private final Map<String, MachineConfig> configurations = new HashMap<>();

    public MachineConfig getMachineConfig(String configName) {
        if (configurations.containsKey(configName)) {
            return configurations.get(configName);
        }

        final MachineConfig machineConfig = new MachineConfig(configName);
        configurations.put(configName, machineConfig);
        return machineConfig;
    }
}
