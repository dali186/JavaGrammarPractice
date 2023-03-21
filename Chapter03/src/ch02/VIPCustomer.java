package ch02;

public class VIPCustomer extends Customer{

	private double discountRatio;
	private int agentId;
	
//	public VIPCustomer() {
//		// super();		//없어도 컴파일러가 넣어줌(디폴트 생성자를 호출 [매개변수가 없는 생성자]) , super()에 매개변수 넣어줘도 됨 -> 사설생성자
//		super(0,"no-name");	
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		discountRatio = 0.1;
//		
//		System.out.println("VIPCustomer() call");
//	}
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		discountRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) call");
	}
	
	public int getAgentId() {
		return agentId;
	}
}
