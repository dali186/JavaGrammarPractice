package Assignments.Day03;

import java.util.Objects;

public class Practice01 {

}
class Clazz01 {
    private int a;
    private double b;
    private char c;
    private String s;

    //1.빈 생성자를 작성하시오.
    public Clazz01() {

    }
    //2.모든 인자를 가지고 있는 생성자를 작성하시오.
    public Clazz01(int a, double b, char c, String s) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.s = s;
    }
    //3.각 필드의 setter&getter를 정의하시오.
    /*
    3-a. setter&getter가 필요한 이유가 무엇인지 설명하시오.
        A. 객체지향프로그래밍에서는 캡슐화를 하기위해 외부에서 내부의 정보(객체의 필드)를 변경하지 못하도록 private 접근제어자를 사용한다.
        private 접근 제어자는 클래스 내부에서만 사용할 수 있도록 제한해서 외부에서 필드에 직접 접근하지 못하도록 막는다.
        이렇게 보호된 필드를 외부에서 사용하려고하면 getter()와 setter()메소드를 사용하여 접근할 수 있다.
        getter()를 사용하여 필요한 필드 값만 불러올 수 있고,
        setter()를 사용하여 필드 값을 변경해야 할 때, 추가적인 검증 작업(권한, 유효성)을 수행하여 안전하게 변경 할 수 있다.
     */
    /*
    3-b. setter&getter가 없고 각 필드의 접근제어자가 public이면 어떤 문제가 생길 수 있는지 서술하시오.
        A. 접근제어자인 public의 접근 범위는 같은 클래스, 같은 패키지 뿐만 아닌 다른 패키지, 외부에서 접근할 수 있다.
        유효성이나 권한 검증작업 없이 외부에서 직접 접근하면 의도하지 않은 이상한 값으로 수정 할 수 있는 문제가 있다.
     */
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    //4.toString() 메소드를 정의하시오.
    @Override
    public String toString() {
        return "Clazz{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", s='" + s + '\'' +
                '}';
    }
    /*
    4-a.toString()이 필요한 이유가 무엇인지 서술하시오.
        A. toString()를 클래스에 오버라이딩하여 클래스의 객체 정보를 String으로 반환하는 메소드를 작성하면,
        해당 객체의 정보를 쉽게 확인할 수 있다.
        객체 이름에는 객체 고유의 ID가 있는데 객체를 그대로 출력하면 객체의 고유ID값이 출력된다.
        하지만 toString()을 재정의 하여 객체를 출력하면 자동으로 toString 메소드가 호출되어
        객체 정보를 출력해준다.
     */
    //5.hashCode(), equals()메소드를 정의하시오.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clazz01 clazz01 = (Clazz01) o;
        return a == clazz01.a && Double.compare(clazz01.b, b) == 0 && c == clazz01.c && Objects.equals(s, clazz01.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, s);
    }

    /*
    5-a.hashCode()가 필요한 이유가 무엇인지 서술하시오.
        A.hashCode()는 객체의 고유값인 hashcode를 반환한다. 두 객체를 비교할 때 hashcode를 사용하면 더 빠른 연산이 가능하다.
        A_hashcode != B_hashcode면, A객체와 B객체는 다르다
        A_hashcode == B_hashcode면, A객체와 B객체는 같을 수 도 있다.
        Heap메모리에 생성된 객체의 같은 주소를 참조하는 Stack메모리의 객체는 두개는 hashcode가 같다, 주소값이 같기 때문.
        String은 변수명이 달라도 같은 문자열을 저장하면 주소값이 같다. -> String은 상수 풀에 저장되기 때문.
        하지만, new로 인스턴스로 생성하면 Heap메모리에 따로따로 저장되기 때문에 주소값이 같지 않다.
     */
    /*
    5-b.equals()가 필요한 이유가 무엇인지 서술하시오.
        A.hashcode가 다르면 서로 다른 객체, hashcode가 같으면 서로 같은 객체 일 수도 있다.
        확실하게 같은 객체라고 할 수 없는 이유는 해시 충돌이 발생하여 동일한 해시코드를 반환했을 수 도있기 때문이다.
        hashcode()값이 같으면 equals()를 사용하여 내용물까지 같은 객체인지 확인할 수 있다.
        equals가 true면 hashcode도 같다.
        equals()를 재정의하면 hashCode()도 재정의 해야한다.
     */
    /*
    5-c.아래 명제의 참,거짓 판단해보기
        1. 만약 두 객체의 hashCode()가 같으면 같은 객체이다. - false
        2. 만약 두 객체의 hashCode()가 다르면 다른 객체이다. - true
        3. 두 객체를 비교할 때 먼저 hashCode()를 비교하면 빠른 비교가 가능하다. - true
        4. 두 객체가 equals()에 의해 동일하다면 두 객체의 hashCode()값도 일치해야 한다. - false
        5. equals()를 재정의하면 hashCode()도 재정의해야한다. - true
     */
}

