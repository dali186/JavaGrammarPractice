package Training.ShoppingMall.Entity;

import Training.ShoppingMall.Enum.Status;

import java.time.LocalDateTime;
import java.util.Objects;

public class Order {
    private String orderNo;
    private ShoppingItem shoppingItem;
    private LocalDateTime orderTime;
    private int orderPrice;
    private Status orderStatus;

    public Order(String orderNo, ShoppingItem shoppingItem, LocalDateTime orderTime, int orderPrice, Status orderStatus) {
        this.orderNo = orderNo;
        this.shoppingItem = shoppingItem;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.orderStatus = orderStatus;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public ShoppingItem getShoppingItem() {
        return shoppingItem;
    }

    public void setShoppingItem(ShoppingItem shoppingItem) {
        this.shoppingItem = shoppingItem;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Status getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Status orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderPrice == order.orderPrice && Objects.equals(orderNo, order.orderNo) && Objects.equals(shoppingItem, order.shoppingItem) && Objects.equals(orderTime, order.orderTime) && orderStatus == order.orderStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNo, shoppingItem, orderTime, orderPrice, orderStatus);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNo='" + orderNo + '\'' +
                ", shoppingItem=" + shoppingItem +
                ", orderTime=" + orderTime +
                ", orderPrice=" + orderPrice +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
