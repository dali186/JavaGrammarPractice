package objectcoperation;

public class Customer {

	private String name;
	private int balance;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void takeTaxi(int price, Taxi taxi) {
		balance += price;
		taxi.takeCustomer(price);
	}
	
	public void showCustomerInfo() {
		System.out.println(name + "님의 남은 돈은" + balance + "원 입니다.");
	}
	
}
