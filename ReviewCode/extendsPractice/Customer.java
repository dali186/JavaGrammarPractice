package extendsPractice;

public class Customer {

	private int customerId;
	private String customerName;
	protected String customerGrade;		//VIPCustomer에서 상속받아 사용하기 위해 protected
	public int bonusPoint;
	protected double bonusRatio;			//VIPCustomer에서 상속받아 사용하기 위해 protected
	
	public Customer() {
		customerGrade = "sliver";
		bonusRatio = 0.01;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	public int payment(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint +"입니다.";
	}
	
}
