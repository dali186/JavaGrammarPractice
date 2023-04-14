package Training.ShoppingMall.Entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class ShoppingCart {
    private String cartNo;
    private ShoppingItem shoppingItem;
    private int items;
    private LocalDateTime cartRegisterTime;
    private boolean isBought;

    public ShoppingCart(String cartNo, ShoppingItem shoppingItem, int items) {
        this.cartNo = cartNo;
        this.shoppingItem = shoppingItem;
        this.items = items;
        this.cartRegisterTime = LocalDateTime.now();
        this.isBought = false;
    }

    public String getCartNo() {
        return cartNo;
    }

    public void setCartNo(String cartNo) {
        this.cartNo = cartNo;
    }

    public ShoppingItem getShoppingItem() {
        return shoppingItem;
    }

    public void setShoppingItem(ShoppingItem shoppingItem) {
        this.shoppingItem = shoppingItem;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public LocalDateTime getCartRegisterTime() {
        return cartRegisterTime;
    }

    public void setCartRegisterTime(LocalDateTime cartRegisterTime) {
        this.cartRegisterTime = cartRegisterTime;
    }

    public boolean isBought() {
        return isBought;
    }

    public void setBought(boolean bought) {
        isBought = bought;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart that = (ShoppingCart) o;
        return items == that.items && isBought == that.isBought && Objects.equals(cartNo, that.cartNo) && Objects.equals(shoppingItem, that.shoppingItem) && Objects.equals(cartRegisterTime, that.cartRegisterTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cartNo, shoppingItem, items, cartRegisterTime, isBought);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartNo='" + cartNo + '\'' +
                ", shoppingItem=" + shoppingItem +
                ", items=" + items +
                ", cartRegisterTime=" + cartRegisterTime +
                ", isBought=" + isBought +
                '}';
    }
}
