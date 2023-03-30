package ch02;

public class StudentTest {

	public static void main(String[] args) {
		
			Student me = new Student();			//이래 생성되는 객체는 인스턴스
			Student other = new Student();
			
			me.studentID = 12345;					//me는 참조변수 -> 메모리 위치를 나타냄
			me.setStudentName("JOOWON");
			me.address = "SEOUL";
			
			other.studentID = 12346;
			other.setStudentName("MOOWON");
			other.address = "BUSAN";
			
			me.showStudentInfo();
			other.showStudentInfo();
			System.out.println(me);
			System.out.println(other);
	}

}
