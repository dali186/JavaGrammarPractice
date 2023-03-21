package ch02;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010,"이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10011, "김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		Customer vc = new VIPCustomer(10012, "noname");
	}

}
