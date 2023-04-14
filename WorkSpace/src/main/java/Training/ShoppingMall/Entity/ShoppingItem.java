package Training.ShoppingMall.Entity;

import Training.ShoppingMall.Enum.Categories;

import java.time.LocalDateTime;
import java.util.Objects;

public class ShoppingItem {
    private String itemNo;
    private String itemName;
    private Categories categories;
    private int itemPrice;
    private String itemInfo;
    private LocalDateTime registerTime;

    public ShoppingItem(String itemNo, String itemName, Categories categories, int itemPrice, String itemInfo) {
        this.itemNo = itemNo;
        this.itemName = itemName;
        this.categories = categories;
        this.itemPrice = itemPrice;
        this.itemInfo = itemInfo;
        this.registerTime = LocalDateTime.now();
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemInfo() {
        return itemInfo;
    }

    public void setItemInfo(String itemInfo) {
        this.itemInfo = itemInfo;
    }

    public LocalDateTime getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(LocalDateTime registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingItem that = (ShoppingItem) o;
        return itemPrice == that.itemPrice && Objects.equals(itemNo, that.itemNo) && Objects.equals(itemName, that.itemName) && categories == that.categories && Objects.equals(itemInfo, that.itemInfo) && Objects.equals(registerTime, that.registerTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemNo, itemName, categories, itemPrice, itemInfo, registerTime);
    }

    @Override
    public String toString() {
        return "ShoppingItem{" +
                "itemNo='" + itemNo + '\'' +
                ", itemName='" + itemName + '\'' +
                ", categories=" + categories +
                ", itemPrice=" + itemPrice +
                ", itemInfo='" + itemInfo + '\'' +
                ", registerTime=" + registerTime +
                '}';
    }
}
