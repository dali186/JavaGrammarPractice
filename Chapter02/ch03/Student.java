package ch03;

public class Student {

	public int studentNumber;
	public String studentName;
	public int grade;
	
	//디폴트 생성자 만듬
	public Student() {
		System.out.println("신규 student 객체 생성");
	} 
	public Student(int studentNumber, String studentName, int grade) {
		System.out.println("신규 student 객체 생성");
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	public String showStudentInfo() {
		
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
	}
}
