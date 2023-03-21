package ch09;
import java.util.Scanner;

public class TaxiTest {

	public static void main(String[] args) {

		Person edward = new Person("Edward", 20000);
		Taxi taxi = new Taxi("잘 간다 운수", 0);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("택시 비용을 입력해주세요.");
		taxi.setPrice(sc.nextInt());
		
		edward.rideTaxi(taxi);
		edward.showInfo();
		taxi.showInfo();
	}
}
