package ch05;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어",100);
		studentLee.setMathSubject("수학", 90);
		
		Student studentKim = new Student(100, "Kim");
		studentKim.setKoreaSubject("국어",70);
		studentKim.setMathSubject("수학", 80);
		
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
	}

}
