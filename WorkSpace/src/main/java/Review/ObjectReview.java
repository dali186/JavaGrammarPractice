package Review;

public class ObjectReview {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        String c = "10";
        String d = "10";

        System.out.println(a == b);
        System.out.println(c.equals(d));
        System.out.println(c == d);
        System.out.println(c != d);
    }
}
