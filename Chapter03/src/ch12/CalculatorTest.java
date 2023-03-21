package ch12;

public class CalculatorTest {
	public static void main(String[] args) {
	
//		int num1 = 10;
//		int num2 = 2;
//		
//		Calc calc = new CompliteCalc();
//		System.out.println(calc.add(num1, num2));
//		System.out.println(calc.substract(num1, num2));
//		System.out.println(calc.times(num1, num2));
//		System.out.println(calc.divide(num1, num2));
//		
//		calc.description();
		
		int ary[] = {1,2,3,4,5,6,7,8};
		System.out.println(Calc.total(ary));	// 인스턴스 생성 없이도 사용 가능. 인터페이스로 호출
		
	}
	
}
