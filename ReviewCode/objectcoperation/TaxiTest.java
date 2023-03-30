package objectcoperation;

public class TaxiTest {

	public static void main(String[] args) {

		Customer customer = new Customer("Edward");
		Taxi taxi = new Taxi("잘 간다 운수");
		
		customer.takeTaxi(10000, taxi);
		customer.showCustomerInfo();
		taxi.showTaxiInfo();
	}

}
