package ch06;

public class GoldCustomer extends Customer{
	
	private double discountRatio;
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		discountRatio = 0.1;
	}

	@Override
	public int payment(int price) {
		bonusPoint += bonusRatio * price;
		price -= (int)(price*discountRatio);
		
		return price;
	}
	
	
}
