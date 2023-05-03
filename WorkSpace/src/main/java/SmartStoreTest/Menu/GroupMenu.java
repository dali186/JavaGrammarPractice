package SmartStoreTest.Menu;

public class GroupMenu {

    private static GroupMenu allGroupMenu;

    public static GroupMenu getInstance() {
        if (allGroupMenu == null) {
            allGroupMenu = new GroupMenu();
        }
        return allGroupMenu;
    }

    private GroupMenu() {

    }
}
