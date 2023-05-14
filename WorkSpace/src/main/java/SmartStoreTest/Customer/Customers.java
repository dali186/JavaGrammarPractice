package SmartStoreTest.Customer;

import SmartStoreTest.Arrays.DArray;

public class Customers extends DArray {

    //singleton
    private static Customers allCustomers;

    public static Customers getInstance() {
        if (allCustomers == null) {
            allCustomers = new Customers();
        }
        return allCustomers;
    }

    private Customers() {

    }
}
