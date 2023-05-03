package SmartStoreTest.Group;

import SmartStoreTest.Arrays.DArray;

public class Groups extends DArray {

    private static Groups allGroups;

    public static Groups getInstance() {
        if (allGroups == null) {
            allGroups = new Groups();
        }
        return allGroups;
    }

    private Groups() {

    }
}
