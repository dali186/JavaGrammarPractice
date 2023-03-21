package ch01;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	//java.lang , 클래스를 쓰레드화 할 때 필요한 run 메소드 구현할 떄 필요한 인터페이스
	//Outer안 getRunnable 메소드
	Runnable getRunnable(int i) {
		
		int num = 10;
		
		//localInnerClass
		return new Runnable(){

			int localNum = 1000;
			@Override
			public void run() {
				//num = 200;   //에러 남. 지역변수는 상수로 바뀜
				//i = 100;     //에러 남. 매개 변수 역시 지역변수처럼 상수로 바뀜 
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
			}
			
		};
	}
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {

			System.out.println("Runnable Class");
		}
	}; 
}

public class AnonumousInnerTest {
	
	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);
		
		runner.run();
		
		out.runnable.run(); 
	}


}
