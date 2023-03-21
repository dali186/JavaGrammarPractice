package ch08;

public class Train {

	private String trainColor;
	private int balance;
	private int customers;
	private int trainPrice;
	
	public String getTrainColor() {
		return trainColor;
	}
	public void setTrainColor(String trainColor) {
		this.trainColor = trainColor;
	}
	public int getTrainPrice() {
		return trainPrice;
	}
	public void setTrainPrice(int trainPrice) {
		this.trainPrice = trainPrice;
	}
	public int getCustomers() {
		return customers;
	}
	public void setCustomers(int trainCustomers) {
		this.customers = trainCustomers;
	}	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void take() {
		customers++;
		balance += trainPrice;
	}
	
	public void showInfo() {
		System.out.println(trainColor + "색 지하철의 승객은 " + customers + "명 이고, 수입은 " + balance + "원 입니다.");
	}
	
	public Train(String trainColor, int balance, int customers, int trainPrice) {
		this.trainColor = trainColor;
		this.balance = balance;
		this.customers = customers;
		this.trainPrice = trainPrice;
	}
	
}
