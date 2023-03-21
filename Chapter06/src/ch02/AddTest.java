package ch02;

public class AddTest {
	public static void main(String[] args) {
	
		//람다식을 add 인터페이스 넣어줌 ;써야됨
		Add addL = (x,y) -> {return x/y;};
		
		System.out.println(addL.add(2, 3));
	}
	
}
