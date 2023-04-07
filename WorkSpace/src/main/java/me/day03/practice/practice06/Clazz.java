package me.day03.practice.practice06;

class A {}
class B {}

public class Clazz {
    private A a;
    private B b;

    public Clazz() {
        a = new A();
        b = new B();
    }
}
/*
아래 클래스를 정의하고 아래의 객체 생성 방법이 객체의 관계 상 좋지 않은 이유를 설명하시오.
    A. Clazz클래스 내의 생성자에서 A클래스와 B클래스의 인스턴스를 생성하고 있다.
       Clazz가 초기화 될 때 A와 B의 인스턴스를 직접적으로 생성하고 있기 때문에
       A와 B 클래스에 강한 의존성을 가지게 된다.
       확장과 유지보수가 더욱 어려워지기 때문에 좋은 코드는 아니다.
 */
