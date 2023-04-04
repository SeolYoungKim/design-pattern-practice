package _07_composite;

public class LimYoHwan {
    public static void main(String[] args) {
        final Group group = new Group();
        group.add(new Marin());
        group.add(new Firebat());
        group.add(new Medic());

        final LimYoHwan limYoHwan = new LimYoHwan();
        limYoHwan.moveUnit(group);
    }

    private void moveUnit(Component component) {
        component.move();
    }
}
