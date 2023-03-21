package ch08;

public class ComputerTest {
	
	public static void main(String[] args) {
	
		Desktop desktop01 = new Desktop();
		Computer desktop02 = new Desktop();
		//Computer computer = new Computer(); - 추상 클래스라 new로 인스턴스화 불가
		desktop01.display();
		desktop02.display();
		desktop01.turnOn();
		desktop02.turnOn();
		
	}
	
}
