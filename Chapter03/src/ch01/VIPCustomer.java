package ch01;

public class VIPCustomer extends Customer{
	private double discountRatio;
	private int agentId;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		discountRatio = 0.1;
	}
	
	public int getAgentId() {
		return agentId;
	}
}
