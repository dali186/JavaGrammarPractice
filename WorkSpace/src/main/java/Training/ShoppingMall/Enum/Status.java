package Training.ShoppingMall.Enum;

public enum Status {
    PAYMENT("결제"), DELIVERY_PRE("배송 준비중"), DELIVERY("배송중"), DELIVERY_COMP("배송완료"), EXCHANGE_RETURN("교환/반품");

    private String orderStatus = null;

    Status (String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
