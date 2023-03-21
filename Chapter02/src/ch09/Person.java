package ch09;

public class Person {

	private String name;
	private int balance;
	
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
	
	public Person(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public void rideTaxi(Taxi taxi) {
		taxi.take();
		balance -= taxi.getPrice();
	}
	
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은 " + balance + "원 입니다.");
	}
}
