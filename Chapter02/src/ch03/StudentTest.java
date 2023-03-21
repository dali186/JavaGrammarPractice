package ch03;

public class StudentTest {

	public static void main(String[] args) {

		Student stdKim = new Student(20192610, "김주원", 3);
		Student stdLee = new Student();
		
		System.out.println(stdKim.showStudentInfo());
		System.out.println(stdLee.showStudentInfo());
	}

}
