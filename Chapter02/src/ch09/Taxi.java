package ch09;

public class Taxi {

	private String company;
	private int balance;
	private int price;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Taxi() {}
	
	public Taxi(String company, int balance) {
		this.company = company;
		this.balance = balance;
	}
	
	public void take() {
		balance += price;
	}
	
	public void showInfo() {
		System.out.println(company + "택시의 수입은 " + balance + "원 입니다.");
	}
	
}
