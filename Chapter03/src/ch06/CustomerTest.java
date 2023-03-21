package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();
		Customer ct01 = new Customer(10001, "이순신");
		Customer ct02 = new Customer(10002, "신사임당");
		GoldCustomer ct03 = new GoldCustomer(20001, "홍길동");
		GoldCustomer ct04 = new GoldCustomer(20002, "이율곡");
		VIPCustomer ct05 = new VIPCustomer(30001, "김유신");
	   
		customerList.add(ct01);
		customerList.add(ct02);
		customerList.add(ct03);
		customerList.add(ct04);
		customerList.add(ct05);

		System.out.println("==========고객정보 출력==========");
		for(Customer c : customerList) {
			System.out.println(c.showCustomerInfo());
		}
		System.out.println("===========할인율과 보너스 포인트 계산===========");
		for(Customer c : customerList) {
			int price = c.showCal(10000);
			System.out.println(c.getCustomerName() + "님이 " + price + "원 지불하셨습니다.");
			System.out.println(c.getCustomerName() + "님의 현재 보너스 포인트는 " + c.bonusPoint + "점 입니다.");
		}
	}

}
