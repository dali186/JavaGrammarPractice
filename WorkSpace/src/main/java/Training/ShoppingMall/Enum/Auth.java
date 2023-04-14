package Training.ShoppingMall.Enum;

public enum Auth {
    ADMIN("ADMIN"), USER("USER");

    private String userAuth = null;

    Auth(String userAuth) {
        this.userAuth = userAuth;
    }

    public String getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(String userAuth) {
        this.userAuth = userAuth;
    }
}
