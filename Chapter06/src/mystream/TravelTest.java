package mystream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class TravelTest {
	
	public static void main(String[] args) {
	
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		
		ArrayList<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		//TravelCustomer에서 toString을 오버라이딩 해놓았기 때문에 가능한듯? 
		//stream.forEach(c -> System.out.println(c));
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		int totalPrice = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(totalPrice);
		
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));

	}
	
}
