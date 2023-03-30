package objectcoperation;

public class Taxi {

	private String company;
	private int balance;
	
	public Taxi(String company) {
		this.company = company;
	}
	
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
	
	public void showTaxiInfo() {
		System.out.println(company + "택시 수입은 " + balance + "원 입니다.");
	}
	
	public void takeCustomer(int price) {
		balance += price;
	}
	
}
