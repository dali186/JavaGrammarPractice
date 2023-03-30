package arrayListTest;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001,"Lee");
		Student studentKim = new Student(1002, "Kim");
		
		studentLee.putScore("국어", 100);
		studentLee.putScore("수학", 50);
		
		studentKim.putScore("국어", 70);
		studentKim.putScore("수학", 85);
		studentKim.putScore("영어", 100);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}

}
