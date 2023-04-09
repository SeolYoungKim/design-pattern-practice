package _10_flyweight;

public class Main {
    public static void main(String[] args) {
        // Flyweight 적용 전
        // 장비가 모두 같은 설정 정보를 사용하는데 계속 객체를 만듬 -> 비효율
        final Machine machine1 = new Machine(new MachineConfig("기본 설정"));
        final Machine machine2 = new Machine(new MachineConfig("기본 설정"));
        final Machine machine3 = new Machine(new MachineConfig("기본 설정"));

        // Flyweight 적용 후
        final MachineConifgFactory factory = new MachineConifgFactory();
        final Machine machineA = new Machine(factory.getMachineConfig("기본 설정"));
        final Machine machineB = new Machine(factory.getMachineConfig("기본 설정"));
        final Machine machineC = new Machine(factory.getMachineConfig("기본 설정"));
    }
}
