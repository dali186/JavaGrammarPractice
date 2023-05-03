package SmartStoreTest.Menu;

public class Menu {

    private static Menu allMenu;

    public static Menu getInstance() {
        if (allMenu == null) {
            allMenu = new Menu();
        }
        return allMenu;
    }

    private Menu() {

    }
}
