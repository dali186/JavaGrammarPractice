package Training.ShoppingMall.Entity;

import Training.ShoppingMall.Enum.Auth;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Objects;

public class Member {
    private String userId;
    private String userPwd;
    private String userEmail;
    private String userAddress;
    private ShoppingCart shoppingCart;
    private Order order;
    private LocalDateTime registerTime;
    private Auth userAuth;

    public Member(String userId, String userPwd, String userEmail, String userAddress) {
        this.userId = userId;
        this.userPwd = userPwd;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.registerTime = LocalDateTime.now(ZoneId.systemDefault());
        this.userAuth = Auth.USER;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public LocalDateTime getRegisterTime() {
        return registerTime;
    }

    public Auth getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(Auth userAuth) {
        this.userAuth = userAuth;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(userId, member.userId) && Objects.equals(userPwd, member.userPwd) && Objects.equals(userEmail, member.userEmail) && Objects.equals(userAddress, member.userAddress) && Objects.equals(registerTime, member.registerTime) && userAuth == member.userAuth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userPwd, userEmail, userAddress, registerTime, userAuth);
    }

    @Override
    public String toString() {
        return "Member{" +
                "userId='" + userId + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", registerTime=" + registerTime +
                ", userAuth=" + userAuth +
                '}';
    }
}
