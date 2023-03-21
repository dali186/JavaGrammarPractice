package ch08;

public class Bus {

	private String busNumber;
	private int balance;
	private int customers;
	private int busPrice;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getCustomers() {
		return customers;
	}
	public void setCustomers(int customers) {
		this.customers = customers;
	}	
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public int getBusPrice() {
		return busPrice;
	}
	public void setBusPrice(int busPrice) {
		this.busPrice = busPrice;
	}
	
	public void take() {
		customers++;
		balance += busPrice;
	}
	
	public void showInfo() {
		System.out.println(busNumber + "번 버스의 승객은 " + customers + "명 이고, 수입은 " + balance + "원 입니다.");
	}
	
	public Bus(String busNumber,int balance, int customers, int busPrice) {
		this.busNumber = busNumber;
		this.balance = balance;
		this.customers = customers;
		this.busPrice = busPrice;
	}
	
}
