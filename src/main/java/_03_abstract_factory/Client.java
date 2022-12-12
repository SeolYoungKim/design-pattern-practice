package _03_abstract_factory;

public class Client {
    public static void main(String[] args) {
        DesktopFactory desktopFactory = new DesktopFactory(new DesktopPartsForBattleGround());
        Desktop desktop = desktopFactory.desktopVer2();

        System.out.println(desktop.cpu());
        System.out.println(desktop.mainBoard());
        System.out.println(desktop.memory());
        System.out.println(desktop.ssd());
    }
}
