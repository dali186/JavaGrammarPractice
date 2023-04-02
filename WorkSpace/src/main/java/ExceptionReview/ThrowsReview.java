package ExceptionReview;

public class ThrowsReview {

    public static void main(String[] args) throws Exception {
        method1();
    }

    static void method1() throws Exception {
        method2();
    }

    private static void method2() throws Exception {
        throw new Exception();
    }

    //Exception in thread "main" java.lang.Exception
    //	at ExceptionReview.ThrowsReview01.method2(ThrowsReview01.java:14)
    //	at ExceptionReview.ThrowsReview01.method1(ThrowsReview01.java:10)
    //	at ExceptionReview.ThrowsReview01.main(ThrowsReview01.java:6)
    //1. 예외가 발생했을 때, 모두 3개의 메소드(main, method1, method2)가 호출스택에 있었으며,
    //2. 예외가 발생한 곳은 제일 윗줄에 있는 method2()라는 것과
    //3. main메소드가 method1()을, 그리고 method1()은 method2()를 호출했다는 것을 알 수 있다.

}
