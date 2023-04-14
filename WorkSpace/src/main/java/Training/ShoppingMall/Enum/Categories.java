package Training.ShoppingMall.Enum;

public enum Categories {
    OUTER("외투"), TOP("상의"), BOTTOM("하의"), INNER("내의"), ACC("악세서리");

    private String category = null;

    Categories(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
