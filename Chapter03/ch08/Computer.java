package ch08;

public abstract class Computer {
	
	//이 상위 클래스에서 구현하지 못할 메소드 선언 -> 하위에서 구현
	public abstract void display();
	public abstract void typing();
	//공통으로 쓸 메소드를 구현
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
