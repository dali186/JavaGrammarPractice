package Assignment.day03.practice03;

public class Main {
    public static void main(String[] args) {
        Clazz cls = new Clazz();
        System.out.println(cls);
    }
    /*
    1.위의 Main 클래스에서 Clazz 클래스 객체 cls를 출력했을 때 toSting()에 정의된 내용물이 출력되지 않고 주소값이 나오는 이유를 설명하시오.
        A.toString()메소드는 최상의 클래스인 Object클래스에 있는 메소드이다.
        이 메소드는 객체를 문자열로 반환하는데 사용하는 메소드로, System.out.prinln()에서 객체를 문자열로 반환해서 출력한다.
        하지만 위 메소드의 이름은 toSting()으로 Object클래스에 toString()을 오버라이딩한 것이 아니라
        Clazz클래스에서 toSting()이라는 새로운 메소드를 정의한 것이기 때문에 주소값이 출력된다.

     2.위의 Clazz 클래스에서 toSting() 위에 @Override annotation을 정의해보고, 컴파일 오류가 생기는 이유가 무엇인지 설명하시오.
        A.Override 어노테이션은 컴파일러에게 상위 클래스에서 메소드를 오버라이딩했다는것을 알려주는 기능을 하는데,
        상위 클래스(Object클래스)에는 toSting()이라는 메소드가 없기 때문에 컴파일 오류가 발생한다.
     */
}
