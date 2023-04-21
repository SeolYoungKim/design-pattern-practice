package _21_visitor;

public class App {
    public static void main(String[] args) {
        final Game battleGround = new BattleGround();
        final GameProvider nintendo = new Nintendo();
        nintendo.accept(battleGround);

        final Game superMario = new SuperMario();
        final GameProvider playStation = new PlayStation();
        playStation.accept(superMario);
    }
}
