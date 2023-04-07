package me.day03.practice.practice02;

public class Clazz {
    private int a;
    private double b;
    private char c;
    private String s;
    private String ss;
    //1.실습 1번 클래스의 필드 중 private String s를 초기화하는 생성자를 작성하시오.
    public Clazz(String s){
        this.s = s;
    }
    //2.실습 2에서 추가 구현한 필드 중 private String ss를 초기화하는 생성자를 작성하시오.
//    public Clazz(String ss) {
//        this.ss = s;
//    }
    /*
    3.위 1-2번을 구현시 컴파일 오류가 날텐데 오류가 나는 이유가 무엇인지 함수의 오버로딩과 관련지어 서술하시오.
        A.메소드를 오버로딩 할 때, 메소드 이름이 같아도 매개변수가 다르면 다른 메소드로 컴파일러는 인식한다.
        위 두개의 생성자는 이름(Clazz)이 같고 매개변수(단일 String)도 같기 때문에 컴파일러가 동일한 메소드를 정의한 것으로 인식하기
        때문에 오류가 발생한다.
     */
}
