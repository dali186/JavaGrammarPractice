package ch04;

public class Order {

	public int orderId;
	public String orderPhoneNumber;
	public String orderPlace;
	public String orderDate;
	public String orderTime;
	public int orderPrice;
	public String orderNumber;
	
	public Order(int orderId, String orderPhoneNumber, String orderPlace, String orderDate, String orderTime, int orderPrice, String orderNumber) {
		this.orderId = orderId;
		this.orderPhoneNumber = orderPhoneNumber;
		this.orderPlace = orderPlace;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.orderNumber = orderNumber;
	}
	
	public void showOrderInfo() {
		System.out.println("주문 접수 번호 : " + orderId + "\n주문 핸드폰 번호 : " + orderPhoneNumber + "\n주문 집 주소 : " + orderPlace + "\n주문 날짜 : "
				+ orderDate + "\n주문 시간 : " + orderTime + "\n주문 가격 : " + orderPrice + "\n메뉴 번호 : " + orderNumber); 
	}
}
