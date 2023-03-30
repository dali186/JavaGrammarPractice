package ch05;

public class Student {

	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		//참조 변수형 쓸 때는 꼭 해줘야함
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showScoreInfo() {
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
}
