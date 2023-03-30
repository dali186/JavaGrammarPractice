package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010,"이순신");
		customerLee.bonusPoint = 1000;
		int price = customerLee.payment(1000);
		System.out.println(customerLee.showCustomerInfo() + price);
		
		VIPCustomer customerKim = new VIPCustomer(10011, "김유신");
		customerKim.bonusPoint = 10000;
		price = customerKim.payment(1000);
		System.out.println(customerKim.showCustomerInfo() + price);
		
		Customer vc = new VIPCustomer(10012, "noname");
		System.out.println(vc.payment(1000));
	   
	}

}
