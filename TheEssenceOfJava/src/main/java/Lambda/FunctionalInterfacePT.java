package Lambda;

//함수형 인터페이스 선언 어노테이션
@FunctionalInterface
public interface FunctionalInterfacePT {

    //오직 하나의 추상 메소드만 정의되어 있어야한다.
    public abstract int max(int a, int b);
    //public abstract int min(int a, int b);
}
