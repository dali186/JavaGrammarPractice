package ch04;

public class OrderTest {

	public static void main(String[] args) {

		Customer tomas = new Customer("Tomas", 180, 78, "010-7179-5316", "SEOUL");
		Order fir = new Order(202303201, tomas.customerPhonenumber, tomas.customerPlace, "20230320", "1948", 4500, "001");
		
		fir.showOrderInfo();
	}

}
